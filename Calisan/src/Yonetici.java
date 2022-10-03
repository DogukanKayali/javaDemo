import java.util.Scanner;

public class Yonetici extends Calisan{

    private int sorumluKisiSayisi;
    Scanner scanner = new Scanner(System.in);

    public Yonetici(String firstName, String lastName, int id, int sorumluKisiSayisi) {
        super(firstName, lastName, id);
        this.sorumluKisiSayisi = sorumluKisiSayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Sorumlu olduğu kişi sayısı: " + sorumluKisiSayisi);
    }

    public void zamYap(int zamMiktari){
        System.out.println(getFirstName() + " çalışanlara yüzde " + zamMiktari + " zam yaptı.");
    }

    public void gorevVer(Yazilimci yazilimci){
        System.out.print("İşletim sistemini girin: ");
        String os = scanner.nextLine();
        yazilimci.formatAt(os);
    }
}
