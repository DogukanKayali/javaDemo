public class Dikdortgen extends Sekil{
    private int uzunKenar;
    private int kisaKenar;

    public Dikdortgen(int uzunKenar, int kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    @Override
    public void alanHesapla() {
        System.out.println("Dikdörtgenin alanı: " + (uzunKenar * kisaKenar));

    }

    @Override
    public double cevreHesapla() {
        return (kisaKenar + uzunKenar) * 2;
    }

}
