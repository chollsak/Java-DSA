package Data_Structure.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Bruno");
        queue.offer("Amad");
        queue.offer("Kobbie");
        queue.offer("Harry");
        queue.offer("Bryan");

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.contains("Harry"));
        System.out.println(queue);
    }
}
