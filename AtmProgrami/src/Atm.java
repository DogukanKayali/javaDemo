import java.util.Scanner;

public class Atm {
    public void work(Account account) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();

        System.out.println("Bankamıza Hoşgeldiniz\n" + "Kullanıcı Girişi");
        int count = 3;

        while (true) {
            if (login.login(account)) {
                System.out.println("Giriş Başarılı...");
                break;
            } else {
                System.out.println("Kullanıcı adı veya şifre yanlış...");
                count -= 1;
                System.out.println("Kalan giriş hakkı: " + count);
            }
            if (count == 0) {
                System.out.println("Giriş hakkınız bitti");
                System.out.println("Programdan Çıkılıyor...");
                Thread.sleep(1000);
                return;
            }
        }

        String operations = "*************************\n" +
                "1 - Bakiye görüntüle\n" +
                "2 - Para Çek\n" +
                "3 - Para Yatır\n" +
                "Çıkmak için q'ya basın...\n" +
                "***********************************";
        while (true) {
            System.out.println(operations);
            System.out.print("Yapmak istediğiniz işlem: ");
            String operation = scanner.nextLine();

            if (operation.equals("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;
            } else if (operation.equals("1")) {
                System.out.println("Hesanızın bakiyesi: " + account.getBalance());

            } else if (operation.equals("2")) {
                System.out.print("Çekmek istediğiniz miktarı girin: ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.withdrawal(amount);

            } else if (operation.equals("3")) {
                System.out.print("Yatırmak istediğiniz miktarı girin: ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.deposit(amount);

            }

        }
    }

}
