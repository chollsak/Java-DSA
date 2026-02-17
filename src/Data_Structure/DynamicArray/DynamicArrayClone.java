package Data_Structure.DynamicArray;

public class DynamicArrayClone {

    public int size;
    public int capacity = 10;
    public Object[] array;

    public DynamicArrayClone(){
        this.array = new Object[capacity];
    }

    public DynamicArrayClone(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public void add(Object data){
        if(size >= capacity){
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data){
        if(size >= capacity){
            grow();
        }
        for(int i = size; i > index; i --){
            array[i] = array[i-1];
        }
        array[index] = data;
        size++;

    }

    public void delete(Object data){
        for(int i = 0; i < size; i++){
            if(array[i] == data){
                for(int j = 0; j < (size - i - 1); j++){
                    array[i+j] = array[i+j+1];
                }
                array[size - 1] = null;
                size--;
                if(size <= (int)(capacity/3)){
                    shrink();
                }
                break;
            }
        }
    }

    public int search(Object data){
        for(int i = 0; i < size; i++){
            if(array[i].equals(data)){
                return i;
            }
        }
       return -1;
    }

    private void grow(){

        int newCapacity = (int)(capacity * 2);
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    private void shrink(){
        int newCapacity = (int)(capacity / 2);
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public String toString(){
        String string = "";

        for(int i = 0; i < capacity; i++){
            string += array[i] + ", ";
        }

        if(string != ""){
            string = "[" + string.substring(0, string.length() - 2) + "]";
        }
        else {
            string = "[]";
        }

        return string;
    }


    public static void main(String[] args){
        DynamicArrayClone dynamicArrayClone = new DynamicArrayClone(5);
        System.out.println(dynamicArrayClone.capacity);

        dynamicArrayClone.add("A");
        dynamicArrayClone.add("B");
        dynamicArrayClone.add("C");
        dynamicArrayClone.add("D");
        dynamicArrayClone.add("E");

        dynamicArrayClone.insert(0, "X");
        dynamicArrayClone.delete("A");
        System.out.println(dynamicArrayClone.search("C"));

        System.out.println(dynamicArrayClone);
        System.out.println("size: " + dynamicArrayClone.size);
        System.out.println("capacity: " + dynamicArrayClone.capacity);
        System.out.println("empty" + dynamicArrayClone.isEmpty());
    }
}
