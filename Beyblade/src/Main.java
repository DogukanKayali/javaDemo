import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Beyblade'e Hoşgeldiniz");
        System.out.println("Çıkış için q'ya basın");

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("****************************************");
            System.out.print("""
                    Hangi beyblade'i üretmek istiyorsunuz ?
                    Dranza, Drayga, Draciel, Dragon
                    Beyblade Adı:\s""");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            } else {
                BeybladeManager beyblade = new BeybladeManager().generateBeyblade(islem);

                if (beyblade == null){
                    System.out.println("Geçerli bir beyblade ismi giriniz");
                }else{
                    beyblade.showInformation();
                    beyblade.atack();
                    beyblade.holyBeastAppear();
                }
            }
        }
    }
}