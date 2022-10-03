import java.util.Scanner;

public class Main {
    static Kart[][] kartlar = new Kart[4][4];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        kartlar[0][0] = new Kart('I');
        kartlar[0][1] = new Kart('S');
        kartlar[0][2] = new Kart('W');
        kartlar[0][3] = new Kart('A');
        kartlar[1][0] = new Kart('G');
        kartlar[1][1] = new Kart('N');
        kartlar[1][2] = new Kart('S');
        kartlar[1][3] = new Kart('W');
        kartlar[2][0] = new Kart('J');
        kartlar[2][1] = new Kart('N');
        kartlar[2][2] = new Kart('G');
        kartlar[2][3] = new Kart('A');
        kartlar[3][0] = new Kart('V');
        kartlar[3][1] = new Kart('I');
        kartlar[3][2] = new Kart('V');
        kartlar[3][3] = new Kart('J');


        while(!oyunBittiMi()){
            oyunTahtasi();
            tahminEt();
        }
    }

    public static void tahminEt(){
        System.out.print("Birinici tahmin (sıra ve satır değerlerini giriniz): ");
        int sira1 = scanner.nextInt();
        int satir1 = scanner.nextInt();
        kartlar[sira1][satir1].setTahmin(true);
        oyunTahtasi();
        System.out.print("İkinci tahmin (sıra ve satır değerlerini giriniz): ");
        int sira2 = scanner.nextInt();
        int satir2 = scanner.nextInt();
        if (kartlar[sira1][satir1].getDeger() == kartlar[sira2][satir2].getDeger()){
            System.out.println("Doğru Tahmin");
            kartlar[sira2][satir2].setTahmin(true);
        }else{
            System.out.println("Yanlış Tahmin");
            kartlar[sira1][satir1].setTahmin(false);
        }
    }

    public static boolean oyunBittiMi(){
        for (Kart[] karts : kartlar) {
            for (int j = 0; j < kartlar.length; j++) {
                if (!karts[j].isTahmin()) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void oyunTahtasi(){

        for (Kart[] karts : kartlar) {
            System.out.println("____________________");
            for (int j = 0; j < kartlar.length; j++) {
                if (karts[j].isTahmin()) {
                    System.out.print(" | " + karts[j].getDeger() + " | ");
                } else {
                    System.out.print(" | | ");
                }

            }
            System.out.println("");
        }
        System.out.println("____________________");

    }
}