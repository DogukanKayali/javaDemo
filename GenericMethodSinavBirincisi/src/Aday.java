public abstract class Aday {
    private int matematik;
    private int turkce;
    private int fen;
    private int sosyal;
    private String isim;

    public Aday(int matematik, int turkce, int fen, int sosyal, String isim) {
        this.matematik = matematik;
        this.turkce = turkce;
        this.fen = fen;
        this.sosyal = sosyal;
        this.isim = isim;
    }

    public int getMatematik() {
        return matematik;
    }

    public int getTurkce() {
        return turkce;
    }

    public int getFen() {
        return fen;
    }

    public int getSosyal() {
        return sosyal;
    }

    public String getIsim() {
        return isim;
    }


    abstract double puanhesapla();

    public static <E extends Aday> E birinci(E e1, E e2, E e3) {
        if (e1.puanhesapla() > e2.puanhesapla() && e1.puanhesapla() > e3.puanhesapla()) {
            return e1;
        } else if (e2.puanhesapla() > e1.puanhesapla() && e2.puanhesapla() > e3.puanhesapla()) {
            return e2;
        } else if (e3.puanhesapla() > e1.puanhesapla() && e3.puanhesapla() > e2.puanhesapla()){
            return e3;
        }else{
            return e1;
        }
    }


}
