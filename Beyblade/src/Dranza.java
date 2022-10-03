public class Dranza extends BeybladeManager{
    private String holyBeast;

    public Dranza(String beybladeUser, int bladeRpm, int atackPower, String holyBeast) {
        super(beybladeUser, bladeRpm, atackPower);
        this.holyBeast = holyBeast;
    }

    @Override
    public void holyBeastAppear() {
        System.out.println(getBeybladeUser() + " " + holyBeast + "'nu ortaya çıkarıyor.");
        System.out.println(getBeybladeUser() + "'nın Saldırısı: Alev Kılıcı");

    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Kutsal Canavar Adı: " + holyBeast);
    }
}
