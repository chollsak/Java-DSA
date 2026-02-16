package Data_Structure.LinkedList;

public class SinglyLinkedListClone<T> {

    private static class Node<T>{
        private final T data;
        private Node<T> next;

        public Node(T data){
            this.data = data;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void addHead(T value){
        Node<T> newNode = new Node<>(value);
        if(isEmpty()){
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
        size ++;
    }

    public void addTail(T value){
        Node<T> newNode = new Node<>(value);
        if(isEmpty()){
            head = newNode;
        }
        tail.next = newNode;
        tail = newNode;
        size ++;
    }

    public T removeHead(){
        if(isEmpty()){
            throw new IllegalStateException("LinkedList is empty");
        }
        T value = head.data;
        head = head.next;
        size --;
        return value;
    }

    public T removeTail(){
        if(isEmpty()){
            throw new IllegalStateException("LinkedList is empty");
        }

        Node<T> start = head;
        while(start.next.next != null){
            start = start.next;
        }
        tail = start;
        start.next = null;
        size --;
        return start.data;
    }

    public void getLinkedList(){
        Node<T> start = head;
        while(start != null){
            System.out.println(start.data);
            start = start.next;
        }

    }

    public static void main(String[] args){
        SinglyLinkedListClone<String> linkedListClone = new SinglyLinkedListClone<>();
        linkedListClone.addHead("Hello");
        linkedListClone.addHead("Dog");
        linkedListClone.addHead("Cat");

        linkedListClone.addTail("Bird");

        linkedListClone.removeTail();

        linkedListClone.getLinkedList();

        System.out.println(linkedListClone.head.data);
        System.out.println(linkedListClone.tail.data);
    }
}
