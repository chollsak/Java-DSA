package Data_Structure.LinkedList;

public class DoublyLinkedListClone<T> {

    private static class Node<T>{
        private final T data;
        private Node<T> next;
        private Node<T> prev;

        public Node(T data){
            this.data = data;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public boolean isEmpty(){
        return (size == 0);
    }

    public void addHead(T value){
        Node<T> newNode = new Node<>(value);
        if(isEmpty()){
            tail = newNode;
            head = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size ++;
    }

    public void addTail(T value){
        Node<T> newNode = new Node<>(value);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size ++;
    }

    public int findNodeByData(T value){
        if(isEmpty()){
            throw new IllegalStateException("Linkedlist is empty.");
        }

        Node<T> current = head;
        int index = 0;
        while (current != null){
            if(current.data.equals(value)){
                return index;
            }
            current = current.next;
            index ++;
        }
        return -1;
    }

    public void insert(T valueToInsert, T valueToFind){
        Node<T> current = head;
        while(current != null){
            if(current.data.equals(valueToFind)){
                Node<T> nodeToInsert = new Node<>(valueToInsert);
                nodeToInsert.prev = current;
                nodeToInsert.next = current.next;

                if(current.next != null ){
                    current.next.prev = nodeToInsert;
                }else{
                    tail = nodeToInsert;
                }

                current.next = nodeToInsert;
                size ++;
                return;
            }

            current = current.next;
        }
    }

    public void getLinkedList(){
        Node<T> start = head;
        while(start != null){
            System.out.println(start.data);
            start = start.next;
        }

    }

    public static void main(String[] args){
        DoublyLinkedListClone<String> doublyLinkedListClone = new DoublyLinkedListClone<>();
        doublyLinkedListClone.addHead("Ronaldo");
        doublyLinkedListClone.addHead("Messi");
        doublyLinkedListClone.addHead("Rashford");

        doublyLinkedListClone.addTail("Neymar");

        System.out.println(doublyLinkedListClone.head.data);
        System.out.println(doublyLinkedListClone.tail.data);
        System.out.println(doublyLinkedListClone.findNodeByData("Rashford"));

        doublyLinkedListClone.insert("Junior", "Messi");

        System.out.println(doublyLinkedListClone.findNodeByData("Junior"));

        doublyLinkedListClone.getLinkedList();
    }
}
