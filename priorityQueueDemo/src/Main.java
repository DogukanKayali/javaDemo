import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Patient> queue = new PriorityQueue<>();

        queue.offer(new Patient("Gökalp","Apandisit"));
        queue.offer(new Patient("Zübeyde","Baş Ağrısı"));
        queue.offer(new Patient("Handan","Yanık"));
        queue.offer(new Patient("Tezcan","Apandisit"));
        queue.offer(new Patient("Ece","Baş Ağrısı"));

        int queueNumber = 1;

        while (!queue.isEmpty()){
            System.out.println(queueNumber + ". sıradaki Hasta: ");
            System.out.println(queue.poll());
            System.out.println("----------------------------------------------");
            queueNumber++;
        }


    }
}