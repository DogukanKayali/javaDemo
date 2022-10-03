public class Beyblade {
    private String beybladeUser;
    private int bladeRpm;
    private int atackPower;

    public Beyblade(){

    }

    public Beyblade(String beybladeUser, int bladeRpm, int atackPower) {
        this.beybladeUser = beybladeUser;
        this.bladeRpm = bladeRpm;
        this.atackPower = atackPower;
    }


    public String getBeybladeUser() {
        return beybladeUser;
    }

    public void setBeybladeUser(String beybladeUser) {
        this.beybladeUser = beybladeUser;
    }

    public int getBladeRpm() {
        return bladeRpm;
    }

    public void setBladeRpm(int bladeRpm) {
        this.bladeRpm = bladeRpm;
    }

    public int getAtackPower() {
        return atackPower;
    }

    public void setAtackPower(int atackPower) {
        this.atackPower = atackPower;
    }
}

