public class Draciel extends BeybladeManager{
    private String holyBeast;

    public Draciel(String beybladeUser, int bladeRpm, int atackPower, String holyBeast) {
        super(beybladeUser, bladeRpm, atackPower);
        this.holyBeast = holyBeast;
    }

    @Override
    public void holyBeastAppear() {
        System.out.println(getBeybladeUser() + " " + holyBeast + "'yı ortaya çıkarıyor.");
        System.out.println(getBeybladeUser() + "'in Savunması: Kale Savunması");
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Kutsal Canavar Adı: " + holyBeast);
    }
}
