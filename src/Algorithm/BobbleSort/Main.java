package Algorithm.BobbleSort;

public class Main {
    public static int[] bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    public static void showElements(int[] arr){
        for(int i: arr){
          System.out.print(i);
        }
    }


    public static void main(String[] args){
        int[] arr = {5,1,2,8,3,9,10,7,4,6};
        int[] sorted_arr = bubbleSort(arr);
        showElements(sorted_arr);


    }
}
