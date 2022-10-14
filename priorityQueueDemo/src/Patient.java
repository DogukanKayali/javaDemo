public class Patient implements Comparable<Patient>{
    private int priority;
    private String name;
    private String complaint;

    public Patient(String name, String complaint) {
        this.name = name;
        this.complaint = complaint;

        if (complaint.equals("Apandisit")){
            priority = 1;
        } else if (complaint.equals("Yanık")) {
            priority = 2;
        }else {
            priority = 3;
        }
    }

    @Override
    public String toString() {
        return "Adı: " + name +
                "\nŞikayeti: " + complaint +
                "\nÖncelik sırası: " + priority;
    }

    @Override
    public int compareTo(Patient patient) {
        if (this.priority < patient.priority){
            return -1;
        } else if (this.priority > patient.priority) {
            return 1;
        }else{
            return 0;
        }
    }
}
