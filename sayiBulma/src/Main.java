public class Main {
    public static void main(String[] args) {
        int[] sayilar = {1, 2, 5, 7, 9, 0};
        int aranacak = 3;
        boolean varMi = false;

        for (Integer sayi : sayilar) {
            if (aranacak == sayi) {
                varMi = true;
                break;
            }
        }

        if (varMi){
            System.out.println("Aradığınız sayı mevcuttur.");
        }else{
            System.out.println("Sayı mevcut değildir");
        }
    }
}
