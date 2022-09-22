import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Harf notu karşılığını giriniz: ");
        String grade = scanner.nextLine();

        switch (grade){
            case "A":
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case "B":
                System.out.println("Çok Güzel : Geçtiniz");
                break;
            case "C":
                System.out.println("iyi : Geçtiniz");
                break;
            case "D":
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case "F":
                System.out.println("Maalesef Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }
    }
}