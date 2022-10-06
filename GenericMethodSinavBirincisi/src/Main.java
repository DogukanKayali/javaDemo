import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] dersler = {"Matematik: ", "Türkçe: ", "Fen: ", "Sosyal: "};
        String[] ogrenciler = new String[3];
        int[][] netler = new int[3][4];

        System.out.println("Birinci Bulma Programı");
        Scanner scanner = new Scanner(System.in);

        String islemler = """
                1. Sayısal Öğrencileri Birincisi
                2. Eşit Ağırlık Öğrencileri Birincisi
                3. Sözel Öğrencileri Birincisi""";


        System.out.println(islemler);

        while (true) {
            System.out.println("Çıkmak için q'ya basın. Devam etmek için herhangi bir giriş yapın.");

            if (scanner.nextLine().equals("q")) {
                System.out.println("Programdan Çıkılıyor");
                break;
            }

            for (int i = 0; i < 3; i++) {
                System.out.print((i + 1) + ". Öğrencinin Adı: ");
                ogrenciler[i] = scanner.nextLine();
                for (int j = 0; j < 4; j++) {
                    System.out.print(dersler[j]);
                    netler[i][j] = scanner.nextInt();
                    scanner.nextLine();
                }
            }

            System.out.print("İşlemi girin: ");
            String islem = scanner.nextLine();

            switch (islem) {
                case "1" -> {
                    Aday[] ogrenci = new Sayisal[3];
                    for (int i = 0; i < 3; i++) {
                            ogrenci[i] = new Sayisal(netler[i][0], netler[i][1], netler[i][2], netler[i][3], ogrenciler[i]);
                    }

                    Aday birinci = Sayisal.birinci(ogrenci[0], ogrenci[1], ogrenci[2]);
                    System.out.println("1. Sayısal Öğrencisi: " + birinci.getIsim() + " Öğrenci Puanı: " + birinci.puanhesapla());
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-");
                    for (Aday aday:ogrenci) {
                        System.out.println("Öğrenci İsmi: " + aday.getIsim() + " Öğrenci Puanı: " + aday.puanhesapla());
                    }
                }
                case "2" -> {
                    Aday[] ogrenci = new EsitAgirlik[3];
                    for (int i = 0; i < 3; i++) {
                            ogrenci[i] = new EsitAgirlik(netler[i][0], netler[i][1], netler[i][2], netler[i][3], ogrenciler[i]);
                    }

                    Aday birinci = EsitAgirlik.birinci(ogrenci[0], ogrenci[1], ogrenci[2]);
                    System.out.println("1. Eşit Ağırlık Öğrencisi: " + birinci.getIsim() + " Öğrenci Puanı: " + birinci.puanhesapla());
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-");
                    for (Aday aday:ogrenci) {
                        System.out.println("Öğrenci İsmi: " + aday.getIsim() + " Öğrenci Puanı: " + aday.puanhesapla());
                    }
                }
                case "3" -> {
                    Aday[] ogrenci = new Sozel[3];
                    for (int i = 0 ; i < 3; i++) {
                        ogrenci[i] = new Sozel(netler[i][0], netler[i][1], netler[i][2], netler[i][3], ogrenciler[i]);
                    }

                    Aday birinci = Sozel.birinci(ogrenci[0], ogrenci[1], ogrenci[2]);
                    System.out.println("1. Sözel Öğrencisi: " + birinci.getIsim() + " Öğrenci Puanı: " + birinci.puanhesapla());
                    System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*-*-");
                    for (Aday aday:ogrenci) {
                        System.out.println("Öğrenci İsmi: " + aday.getIsim() + " Öğrenci Puanı: " + aday.puanhesapla());
                    }
                }
                default -> System.out.println("Geçersiz İşlem");
            }
        }
    }
}
