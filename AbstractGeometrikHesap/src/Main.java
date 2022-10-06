import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String islemler = """
                1 - Kare Alan Hesapla
                2 - Kare Çevre Hesapla
                3 - Dikdörtgen Alan Hesapla
                4 - Dikdörtgen Çevre Hesapla
                5 - Daire Alan Hesapla
                6 - Daire Çevre Hesapla
                Çıkış: q
                """;

        label:
        while (true) {
            System.out.println(islemler);
            System.out.print("Hangi Hesaplamayı yapmak istiyorsunuz: ");
            String sekilTuru = scanner.nextLine();
            Sekil sekil = null;

            switch (sekilTuru) {
                case "1": {
                    System.out.print("Karenin kenar uzunluğunu girin: ");
                    int kenar = scanner.nextInt();
                    scanner.nextLine();
                    sekil = new Kare(kenar);
                    sekil.alanHesapla();
                    break;
                }
                case "2": {
                    System.out.print("Karenin kenar uzunluğunu girin: ");
                    int kenar = scanner.nextInt();
                    scanner.nextLine();
                    sekil = new Kare(kenar);
                    System.out.println("Karenin Çevresi: " + sekil.cevreHesapla());
                    break;
                }
                case "3": {
                    System.out.print("Dikdörtgenin kenar uzunluklarını girin (1. Kenar, 2.Kenar): ");
                    int kenar1 = scanner.nextInt();
                    int kenar2 = scanner.nextInt();
                    scanner.nextLine();
                    sekil = new Dikdortgen(kenar1, kenar2);
                    sekil.alanHesapla();
                    break;
                }
                case "4": {
                    System.out.print("Dikdörtgenin kenar uzunluklarını girin (1. Kenar, 2.Kenar): ");
                    int kenar1 = scanner.nextInt();
                    int kenar2 = scanner.nextInt();
                    scanner.nextLine();
                    sekil = new Dikdortgen(kenar1, kenar2);
                    System.out.println("Dikdörtgenin Çevresi: " + sekil.cevreHesapla());
                    break;
                }
                case "5": {
                    System.out.print("Dairenin yapıçapını girin: ");
                    int yaricap = scanner.nextInt();
                    scanner.nextLine();
                    sekil = new Daire(yaricap);
                    sekil.alanHesapla();
                    break;
                }
                case "6": {
                    System.out.print("Dairenin yapıçapını girin: ");
                    int yaricap = scanner.nextInt();
                    scanner.nextLine();
                    sekil = new Daire(yaricap);
                    System.out.println("Dairenin Çevresi: " + sekil.cevreHesapla());
                    break;
                }
                case "q":
                    System.out.println("Programdan çıkılıyor...");
                    break label;
                default:
                    System.out.println("Geçersiz işlem");
                    break;
            }
        }
    }
}
