public class Main {
    public static void main(String[] args) throws InterruptedException {

        Atm atm = new Atm();
        Account account = new Account("Doğukan", "123", 15000);

        atm.work(account);
    }
}