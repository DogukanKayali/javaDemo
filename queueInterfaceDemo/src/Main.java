import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Queue<String> queue = new LinkedList<>();
        Random random = new Random();

        queue.offer("Taner");
        queue.offer("Gaye");
        queue.offer("Bedirhan");
        queue.offer("Gamze");
        queue.offer("Tayfun");
        queue.offer("Hayal");
        queue.offer("Uğur");
        queue.offer("Derya");
        queue.offer("Alper");
        queue.offer("Kader");

        int item = random.nextInt(1,11);


        for (int i = 0; i < item; i++){
            System.out.println(queue.poll() + " Eşyayı aldı");
            Thread.sleep(1500);
        }
        System.out.println("Alınacak eşya kalmadı...");

        System.out.println("--------------------------");

        if (!queue.isEmpty()){
            System.out.println("Eşya alamayan kişiler");
            for (String queue1:queue){
                System.out.println(queue1);
            }
        }else{
            System.out.println("Herkes eşya aldı.");
        }
    }
}