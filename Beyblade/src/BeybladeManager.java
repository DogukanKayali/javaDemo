import org.jetbrains.annotations.NotNull;

public class BeybladeManager extends Beyblade{

    public BeybladeManager() {

    }

    public BeybladeManager(String beybladeUser, int bladeRpm, int atackPower) {
        super(beybladeUser, bladeRpm, atackPower);
    }

    public void atack(){
        System.out.println(getBeybladeUser() + " " + getAtackPower() * getBladeRpm() + " ile saldırıyor.");
    }

    public void holyBeastAppear(){
        System.out.println("Bu bayblade'in kutsal canavarı bulunmuyor.");
    }

    public void showInformation(){
        System.out.println("Beyblade kullanıcısı: " + getBeybladeUser());
        System.out.println("Saldırı Gücü: " + getAtackPower());
        System.out.println("Dönüş Hızı: " + getBladeRpm());
    }

    public BeybladeManager generateBeyblade(@NotNull String beybladeType){

        if (beybladeType.equals("Dragon")){
            return new Dragon("Takao",80,300,"Mavi Ejderha","Kutsal Canavarla Konuşma");
        }
        else if(beybladeType.equals("Dranza")){
            return new Dranza("Kai",600,400,"Kırmızı Anka Kuşu");
        }
        else if(beybladeType.equals("Drayga")){
            return new Drayga("Rei",800,250,"Beyaz Kaplan");
        }
        else if(beybladeType.equals("Draciel")){
            return new Draciel("Max",400,1000,"Kara Kaplumbağa");
        }else{
            return null;
        }

    }


}
