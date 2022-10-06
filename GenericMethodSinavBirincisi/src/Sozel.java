public class Sozel extends Aday{


    public Sozel(int matematik, int turkce, int fen, int sosyal, String isim) {
        super(matematik, turkce, fen, sosyal, isim);
    }

    @Override
    double puanhesapla() {
        return ((getMatematik()*2.1) + (getTurkce()*7) + (getFen()*1.4) +  (getSosyal()*4.9));
    }
}
