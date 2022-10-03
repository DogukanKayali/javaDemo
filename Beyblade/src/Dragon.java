public class Dragon extends BeybladeManager{
    private String holyBeast;
    private String hiddenTalent;

    public Dragon(String beybladeUser, int bladeRpm, int atackPower, String holyBeast, String hiddenTalent) {
        super(beybladeUser, bladeRpm, atackPower);
        this.hiddenTalent = hiddenTalent;
        this.holyBeast = holyBeast;
    }

    @Override
    public void holyBeastAppear() {
        System.out.println(getBeybladeUser() + " " + holyBeast + "'yı ortaya çıkarıyor.");
        System.out.println(getBeybladeUser() + "'nun Saldırısı: Hayalet Kasırgası");
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Kutsal Canavar Adı: " + holyBeast);
        System.out.println("Gizli Yetenek: " + hiddenTalent);
    }
}
