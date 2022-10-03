import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Yonetici yonetici = new Yonetici("Doğukan","Kayalı",541,20);
        Yazilimci yazilimci = new Yazilimci("Doğukan","Kayalı",541,10000,"Java, Python, SQL");

        Scanner scanner = new Scanner(System.in);


        String islemler = """
                *****************************
                \tişlemler...
                1. Yazılımcı işlemleri
                2. Yönetici işlemleri
                Çıkış için q'ya basın
                *****************************""";

        System.out.println(islemler);

        while(true){
            System.out.print("İşlemi seçiniz: ");
            String islem = scanner.nextLine();

            if(islem.equals("q")){
                System.out.println("Çıkış yapılıyor");
                break;
            } else if (islem.equals("1")) {

                String yazilimciIslem = """
                        1. Format at
                        2. Bilgileri göster
                        Çıkış için q'ya basın""";
                System.out.println(yazilimciIslem);
                while (true){
                    System.out.print("İşlemi seçiniz: ");
                    String yIslem = scanner.nextLine();
                    if (yIslem.equals("q")){
                        System.out.println("Yazılımcı işlmelerinden çıkılıyor...");
                        System.out.println(islemler);
                        break;
                    } else if (yIslem.equals("1")) {
                        System.out.print("İşletim sistemini girin: ");
                        String isletimSistemi = scanner.nextLine();
                        yazilimci.formatAt(isletimSistemi);

                    } else if (yIslem.equals("2")) {
                        yazilimci.bilgileriGoster();

                    }else{
                        System.out.println("Geçersiz Yazılımcı işlemi");
                    }
                }
                
            } else if (islem.equals("2")) {

                String yoneticiIslem = """
                        1. Zam Yap
                        2. Bilgileri Göster
                        3. Görev ver
                        Çıkmak için q'ya basın""";
                System.out.println(yoneticiIslem);
                label:
                while (true){
                    System.out.print("İşlemi seçiniz: ");
                    String yIslem = scanner.nextLine();
                    switch (yIslem) {
                        case "q":
                            System.out.println("Yönetici işlemlerinden çıkılıyor...");
                            System.out.println(islemler);
                            break label;
                        case "1":
                            System.out.println("Zam yüzdesini giriniz: ");
                            int zam = scanner.nextInt();
                            scanner.nextLine();
                            yonetici.zamYap(zam);
                            yazilimci.setSalary(yazilimci.getSalary() + (yazilimci.getSalary() * zam) / 100);


                            break;
                        case "2":
                            yonetici.bilgileriGoster();

                            break;
                        case "3":
                            yonetici.gorevVer(yazilimci);

                            break;
                        default:
                            System.out.println("Geçersiz Yönetici işlemi");
                            break;
                    }
                }

            }else{
                System.out.println("Geçersiz işlem");
            }
        }
    }
}
