public class Sayisal extends Aday {


    public Sayisal(int matematik, int turkce, int fen, int sosyal, String isim) {
        super(matematik, turkce, fen, sosyal, isim);
    }

    @Override
    double puanhesapla() {
        return (getMatematik() * 7 + getTurkce() * 2.1 + getFen() * 4.9 +  getSosyal() * 1.4);
    }
}
