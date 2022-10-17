import java.io.PrintStream;
import java.util.Scanner;

class HarcException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("Harç miktarını tam yatırın...");
    }
}

class SiyasiException extends Exception {
    @Override
    public void printStackTrace(PrintStream s) {
        System.out.println("Siyasi yasağınız bulunuyor...");
    }
}

class VizeException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("Geçerli vizeniz bulunmuyor...");
    }
}

public class Yolcu {

    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yatırdığınız harç bedeli: ");
        this.harc = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Herhangi bir siyasi yasağınız bulunuyor mu? (evet ya da hayır): ");
        String cevap = scanner.nextLine();

        this.siyasiYasak = cevap.equals("evet");

        System.out.print("Vizeniz bulunuyor mu? (evet ya da hayır): ");
        String cevap2 = scanner.nextLine();

        this.vizeDurumu = cevap2.equals("evet");
    }


    public void yurtDisiHarciKontrol() throws HarcException {
        if (harc < 150) {
            throw new HarcException();

        } else {
            System.out.println("Yurtdışı harcı işlemi onaylandı.");
        }
    }


    public void siyasiYasakKontrol() throws SiyasiException {
        if (siyasiYasak) {
            throw new SiyasiException();

        } else {
            System.out.println("Siyasi yasağınız bulunmamaktadır.");

        }

    }


    public void vizeDurumuKontrol() throws VizeException {
        if (vizeDurumu) {
            System.out.println("Vizeniz geçerlidir.");


        } else {
            throw new VizeException();

        }

    }
}
