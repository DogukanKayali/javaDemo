public class Ucgen extends Sekil{
    private int kenar1;
    private int kenar2;
    private int kenar3;


    public Ucgen(int kenar1, int kenar2, int kenar3) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.kenar3 = kenar3;
    }

    @Override
    public void alanHesapla() {
        double u =cevreHesapla()/2;
        System.out.println("Üçgenin Alanı: " + Math.sqrt((u * (u-kenar1) * (u-kenar2) * (u-kenar3))));
    }

    @Override
    public double cevreHesapla() {
        return kenar1 + kenar2 + kenar3;
    }



}
