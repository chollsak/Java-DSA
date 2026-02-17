package Algorithm.LinearSearch;

public class Main {

    // linear search = Iterate through a collection one element at the time.
    public static int linearSearch(int[] array, int value){

        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){

        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        int index = linearSearch(array, 5);

        if(index != -1){
            System.out.println("Element Found, At index: " + index);
        }else{
            System.out.println("No Element in this array");
        }
    }
}
