public class Yazilimci extends Calisan {
    private String diller;

    private int salary;

    public Yazilimci(String firstName, String lastName, int id, int salary, String diller) {
        super(firstName, lastName, id);
        this.diller = diller;
        this.salary = salary;
    }

    public void formatAt(String isletimSistemi) {
        System.out.println(getFirstName() + " " +getLastName() + " " + isletimSistemi + " yüklüyor...");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Bildiği diller : " + diller);
        System.out.println("Maas: " + getSalary());

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
