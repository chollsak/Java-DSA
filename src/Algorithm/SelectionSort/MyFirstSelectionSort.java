package Algorithm.SelectionSort;



public class MyFirstSelectionSort {
    public static int[] selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static void showElements(int[] arr){
        for(int i : arr){
            System.out.print(i);
        }
    }

    public static void main(String[] args){
        int[] arr = {5,1,2,8,3,9,10,7,4,6};
        int[] sorted_arr = selectionSort(arr);
        showElements(sorted_arr);

    }
}
