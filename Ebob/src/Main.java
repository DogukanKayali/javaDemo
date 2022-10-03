import java.util.Scanner;

public class Main {
    public static int ebobBulma(int sayi1, int sayi2){
        int ebob = 1;
        for (int i = 1; i <= sayi1 && i <= sayi2; i++){
            if (sayi1 % i == 0 && sayi2 % i == 0){
                ebob = i;
            }
        }
        return ebob;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayi: ");
        int birinci_sayi = scanner.nextInt();
        System.out.print("İkinci sayi: ");
        int ikinci_sayi = scanner.nextInt();

        System.out.println("İki sayini ebob'u: " + ebobBulma(birinci_sayi,ikinci_sayi));
    }
}