import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args){
        String word;
        Stack<Character> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime giriniz: ");

        word = scanner.nextLine();

        for(int i=0; i <word.length()/2; i++){
            stack.push(word.charAt(i));
        }


        if (isPalindrome(word,stack)){
            System.out.println(word + " Palindromedur.");
        }else{
            System.out.println(word + " Palindrome değildir.");
        }

    }

    public static boolean isPalindrome(String cumle, Stack<Character> stack){
        for (int i = (cumle.length()/2) + 1; i < cumle.length(); i++){
            if (cumle.charAt(i) != stack.pop()){
                return false;
            }
        }
        return true;
    }

}
