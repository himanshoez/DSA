import java.util.Arrays;

public class selectionSort {

    static void swap(int[] arr, int i, int j){
        int temp = arr[j];
         arr[j] =  arr[i];
         arr[i] =  temp;
    }

    static void main(String[] args){
        int[] arr = {1,2,3,4,24,153,12};

        for(int i = 0; i <= (arr.length - 2); i++){
            int mini = i;
            for(int j = i; j <= arr.length-1; j++){
                if(arr[j] < arr[mini])
                    mini = j;
            }
            swap(arr, i, mini);
            
        }

        // for(int i =0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        System.out.println(Arrays.toString(arr).replace("]", " ").replace("[", " "));

    }
}
