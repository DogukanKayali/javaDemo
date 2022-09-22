import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Vize notunu giriniz: ");
        int vize1 = scanner.nextInt();
        System.out.print("2. Vize notunu giriniz: ");
        int vize2 = scanner.nextInt();
        System.out.print("Final notunu giriniz: ");
        int finalNotu = scanner.nextInt();

        double ortalama = (vize1*0.3) + (vize2*0.3) + (finalNotu*0.4);

        System.out.println("Not ortalamanız: " + ortalama);


    }
}