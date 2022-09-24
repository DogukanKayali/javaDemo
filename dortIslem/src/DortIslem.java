public class DortIslem {

    public int topla(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

    public int cikar(int sayi1, int sayi2) {
       return sayi1 - sayi2;

    }

    public int carp(int... sayilar) {
        int sonuc = 1;
        for (int sayi : sayilar) {
            sonuc *= sayi;
        }
        return sonuc;

    }

    public void bolme(int sayi1, int sayi2) {
        try {
            int sonuc = sayi1 / sayi2;
            System.out.println(sonuc);


        }catch (ArithmeticException e){
            System.out.println("Bir sayı 0'a bölünemez");
        }
    }

}
