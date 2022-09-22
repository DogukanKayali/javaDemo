import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = random.nextInt(101);

        int counter = 0;

        while (true) {
            System.out.println("Bir sayı girin (Çıkmak için 0'a basın) : ");
            int number1 = scanner.nextInt();
            if (number1 == 0) {
                System.out.println("Programdan Çıkılıyor...");
                break;
            } else if (number1 < number) {
                System.out.println("Daha yüksek bir sayı girin...");
                counter++;
                System.out.println("Tahmin sayınız: " + counter);
            } else if (number1 > number) {
                System.out.println("Daha düşük bir sayı girin...");
                counter++;
                System.out.println("Tahmin sayınız: " + counter);
            } else {
                System.out.println("Tebrikler... Doğru bildiniz");
                counter++;
                System.out.println("Tahmin sayınız: " + counter);
                break;
            }
        }
    }
}