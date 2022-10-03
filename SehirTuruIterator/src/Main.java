import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> sehirler = new LinkedList<>();

        sehirler.add("İstanbul");
        sehirler.add("Bursa");
        sehirler.add("İzmir");
        sehirler.add("Antalya");

        sehirleriTurla(sehirler);
    }

    public static void sehirleriTurla(LinkedList<String> sehirler){
        ListIterator<String> iterator = sehirler.listIterator();

        int islem;

        islemleriBastir();

        Scanner scanner = new Scanner(System.in);


        if (!iterator.hasNext()){
            System.out.println("Herhangi bir şehir bulunmuyor.");
        }

        boolean cikis = false;
        boolean ileri = true;

        while (!cikis){
            System.out.println("Bir işlem seçiniz: ");
            islem = scanner.nextInt();
            switch (islem) {
                case 1 -> islemleriBastir();
                case 2 -> {
                    if (!ileri) {
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                        ileri = true;
                    }
                    if (!iterator.hasNext()) {
                        System.out.println("Gidilecek başka şehir kalmadı.");

                    } else {
                        System.out.println("Bir sonraki şehre gidiliyor\n" +
                                "Gidilen şehir: " + iterator.next());
                    }
                }
                case 3 -> {
                    if (ileri) {
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        ileri = false;
                    }
                    if (!iterator.hasPrevious()) {
                        System.out.println("Geri dönülecek şehir kalmadı.");


                    } else {
                        System.out.println("Bir önceki şehre gidiliyor\n" +
                                "Gidilen şehir: " + iterator.previous());
                    }
                }
                case 4 -> {
                    System.out.println("Uygulamadan çıkılıyor...");
                    cikis = true;
                }
                default -> System.out.println("Geçersiz seçim...");
            }

        }
    }

    public static void islemleriBastir(){
        System.out.println("""
                1 - İşlemleri Görüntüle
                2 - Bir Sonraki Şehre Git
                3 - Bir Önceki Şehre Git
                4 - Uygulamadan Çık""");
    }
}