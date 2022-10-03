import java.util.Scanner;

public class Login {

    public boolean login(Account account){
        String user_name;
        String password;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı Adı: ");
        user_name = scanner.nextLine();
        System.out.print("Şifre: ");
        password = scanner.nextLine();

        if (account.getUser_name().equals(user_name) && account.getPassword().equals(password)){
            return true;
        }else{
            return false;
        }
    }
}
