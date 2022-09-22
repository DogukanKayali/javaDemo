import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String choieces = "\n1 - Centigrade to Fahrenheit\n" +
                "2 - Fahrenheit to Centigrade\n" +
                "Çıkmak için 'q'ya basın\n";

        while (true) {

            System.out.println(choieces);
            System.out.print("Seçiminizi giriniz: ");
            String choice = scanner.nextLine();


            if (choice.equals("q")) {
                System.out.println("Dönüştürücüden çıkılıyor...");
                break;

            }else if (choice.equals("1")) {
                System.out.print("Sıcaklığı giriniz: ");
                double temperature = scanner.nextDouble();
                scanner.nextLine();
                double degree = (temperature * 1.8) + 32;
                System.out.println(temperature + " Santigrat " + degree + " Fahrenhayt'dır");

            } else if (choice.equals("2")){
                System.out.print("Sıcaklığı giriniz: ");
                double temperature = scanner.nextDouble();
                scanner.nextLine();
                double degree = (temperature - 32) / 1.8;
                System.out.println(temperature + " Fahrenhayt " + degree + " Santigrat'dır");
            }else{
                System.out.println("-------------Geçersiz Seçim-------------");

            }

        }
    }
}