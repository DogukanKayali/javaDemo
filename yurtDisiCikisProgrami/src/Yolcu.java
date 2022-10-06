import java.util.Scanner;

public class Yolcu implements IYurtDisiKurallari{

    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu(){
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


    @Override
    public boolean yurtDisiHarciKontrol() {
        if (harc < 150){
            System.out.println("Harç ücretiniz yeterli değil\n" +
                    "Esik yatırdığınız tutar: " + (150-harc) + " TL");
            return false;
        }else{
            System.out.println("Yurtdışı harcı işlemi onaylandı.");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if (siyasiYasak){
            System.out.println("Siyasi yasağınız olduğu için çıkış işleminiz yapılamadı");
            return false;

        }else{
            System.out.println("Siyasi yasağınız bulunmamaktadır.");
            return true;
        }

    }

    @Override
    public boolean vizeDurumuKontrol() {
        if (vizeDurumu){
            System.out.println("Vizeniz geçerlidir.");
            return true;

        }else{
            System.out.println("Vizeniz bulunmadığından çıkış işleminiz yapılamadı");
            return false;
        }

    }
}
