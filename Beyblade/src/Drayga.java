public class Drayga extends BeybladeManager{
    private String holyBeast;

    public Drayga(String beybladeUser, int bladeRpm, int atackPower, String holyBeast) {
        super(beybladeUser, bladeRpm, atackPower);
        this.holyBeast = holyBeast;
    }

    @Override
    public void holyBeastAppear() {
        System.out.println(getBeybladeUser() + " " + holyBeast + "'ı ortaya çıkarıyor.");
        System.out.println(getBeybladeUser() + "'nın Saldırısı: Kaplan Pençesi");
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Kutsal Canavar Adı: " + holyBeast);
    }
}
