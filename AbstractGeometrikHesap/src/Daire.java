public class Daire extends Sekil{
    private int yaricap;

    public Daire(int yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public void alanHesapla() {
        System.out.println("Dairenin alanı: " + (Math.PI * yaricap * yaricap));

    }

    @Override
    public double cevreHesapla() {
        return (2 * Math.PI * yaricap);
    }
}
