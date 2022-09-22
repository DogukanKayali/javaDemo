import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");

        int number = scanner.nextInt();

        for ( int i = 2; i < number; i++){
            if (number % i == 0){
                System.out.println(number + " Asal sayı değildir.");
            }else {
                System.out.println(number + " Asal sayıdır.");
            }
            break;
        }
    }
}