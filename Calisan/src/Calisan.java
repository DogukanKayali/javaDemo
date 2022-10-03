public class Calisan {
    private String firstName;
    private String lastName;
    private int id;




    public Calisan(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void bilgileriGoster(){
        System.out.println("Çalışan bilgileri....");
        System.out.println("Ad: " + getFirstName());
        System.out.println("Soyad: " + getLastName());
        System.out.println("Id: " + getId());
    }
}
