public class EsitAgirlik extends Aday{


    public EsitAgirlik(int matematik, int turkce, int fen, int sosyal, String isim) {
        super(matematik, turkce, fen, sosyal, isim);
    }

    @Override
    double puanhesapla() {
        return (getMatematik()*6.3 + getTurkce()*5.6 + getFen()*1.4 +  getSosyal()*2.1);
    }
}
