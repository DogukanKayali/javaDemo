public class Kare extends Sekil{
    private int kenar;
    public Kare(int kenar) {
        this.kenar = kenar;
    }

    @Override
    public void alanHesapla() {
        System.out.println("Karenin alanı: " + (kenar * kenar));

    }

    @Override
    public double cevreHesapla() {
        return kenar * 4;
    }
}
