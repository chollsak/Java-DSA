package Data_Structure.Queue;

import java.util.ArrayDeque;

public class QueueClone<T> {
    private ArrayDeque<T> arr = new ArrayDeque<T>();

    public void enqueue(T value){
        arr.addLast(value);
    }

    public void dequeue(){
        if(arr.isEmpty()){
            throw  new IllegalStateException("No item in queue.");
        }

        arr.removeFirst();
    }

    public boolean contain(T value){
        System.out.println(arr.contains(value));
        return arr.contains(value);
    }

    public void getQueue(){
        System.out.println(arr);
    }

    public static void main(String[] args){
        QueueClone<String> queueClone = new QueueClone<>();

        queueClone.enqueue("Chollasak");
        queueClone.enqueue("Cunha");
        queueClone.enqueue("Darren");

        queueClone.getQueue();

        queueClone.dequeue();
        queueClone.getQueue();
        queueClone.contain("Chollasak");

    }
}
