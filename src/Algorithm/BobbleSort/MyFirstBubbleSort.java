package Algorithm.BobbleSort;

public class MyFirstBubbleSort {
    public static int[] bubbleSort(int[] arr){
        boolean sorted = false;
        int swapCounter = 0;
        while(!sorted){
            for(int i = 0; i < arr.length; i++){
                if(i + 1 < arr.length){
                    if(arr[i+1] < arr[i]){
                        int temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                        swapCounter += 1;
                    }
                }
            }

            if(swapCounter == 0){
                sorted = true;
            }

            swapCounter = 0;
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

