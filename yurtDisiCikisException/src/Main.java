public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("\tHavaalanına Hoşgeldiniz");

        String kurallar = """
                \tYurtdışı çıkış kuralları...
                *Siyasi yasağınızın bulunmaması gerekiyor.
                *150 TL harç bedelini tam yatırmanız gerekiyor.
                *Gideceğiniz ülkeye vizenizin bulunması gerekiyor.""";

        while (true) {

            System.out.println("\n**************************************************");
            System.out.println(kurallar);
            System.out.println("**************************************************");
            Yolcu yolcu = new Yolcu();
            System.out.println("++Harç bedeli kontrol ediliyor.");
            Thread.sleep(2000);
            try {
                yolcu.yurtDisiHarciKontrol();
            } catch (HarcException e) {
                e.printStackTrace();
                continue;
            }

            System.out.println("++Siyasi yasak kontrol ediliyor");
            Thread.sleep(2000);
            try {
                yolcu.siyasiYasakKontrol();
            } catch (SiyasiException e) {
                e.printStackTrace();
                continue;
            }

            System.out.println("++Vize durumu kontrol ediliyor.");
            Thread.sleep(2000);
            try {
                yolcu.vizeDurumuKontrol();
            } catch (VizeException e) {
                e.printStackTrace();
                continue;
            }

            System.out.println("İşlemleriniz tamamlanmıştır. İyi yolculuklar.");
            break;
        }
    }
}