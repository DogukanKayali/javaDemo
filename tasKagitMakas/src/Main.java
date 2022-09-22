import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("********** Taş - Kağıt - Makas **********");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int counterPlayer = 0;
        int counterMachine = 0;


        while (true) {
            String choices =
                    "1 - Taş\n" +
                    "2 - Kağıt\n" +
                    "3 - Makas\n" +
                    "9 - Çıkış\n"+
                    "********************";

            System.out.println(choices);

            int machineChoice = random.nextInt(1, 4);

            System.out.print("Seçiminiz: ");
            int choice = scanner.nextInt();
            System.out.println("********************");

            if ( choice == 9){
                System.out.println("Çıkış yapılıyor...");
                break;
            }else if (choice == 1 & machineChoice == 1) {
                System.out.println("Oyuncunun seçimi: Taş -- Bilgisayarın seçimi: Taş");
                System.out.println("Berabere");
            } else if (choice == 2 & machineChoice == 1) {
                System.out.println("Oyuncunun seçimi: Kağıt -- Bilgisayarın seçimi: Taş");
                System.out.println("Oyuncu kazandı");
                counterPlayer++;
            } else if (choice == 3 & machineChoice == 1) {
                System.out.println("Oyuncunun seçimi: Makas -- Bilgisayarın seçimi: Taş");
                System.out.println("Bilgisayar kazandı");
                counterMachine++;
            } else if (choice == 1 & machineChoice == 2) {
                System.out.println("Oyuncunun seçimi: Taş -- Bilgisayarın seçimi: Kağıt");
                System.out.println("Bilgisayar kazandı");
                counterMachine++;
            } else if (choice == 2 & machineChoice == 2) {
                System.out.println("Oyuncunun seçimi: Kağıt -- Bilgisayarın seçimi: Kağıt");
                System.out.println("Berabere");
            } else if (choice == 3 & machineChoice == 2) {
                System.out.println("Oyuncunun seçimi: Makas -- Bilgisayarın seçimi: Kağıt");
                System.out.println("Oyuncu kazandı");
                counterPlayer++;
            } else if (choice == 1 & machineChoice == 3) {
                System.out.println("Oyuncunun seçimi: Taş -- Bilgisayarın seçimi: Makas");
                System.out.println("Oyuncu kazandı");
                counterPlayer++;
            } else if (choice == 2 & machineChoice == 3) {
                System.out.println("Oyuncunun seçimi: Kağıt -- Bilgisayarın seçimi: Makas");
                System.out.println("Bilgisayar kazandı");
                counterMachine++;
            } else if (choice == 3 & machineChoice == 3) {
                System.out.println("Oyuncunun seçimi: Makas -- Bilgisayarın seçimi: Makas");
                System.out.println("Berabere");
            }else{
                System.out.println("Yanlış seçim yaptınız... Tekrar seçim yapın...");
            }


            System.out.println("\nOyuncu skoru: " + counterPlayer +
                    "\nBilgisayar skoru: " + counterMachine);


        }
    }
}