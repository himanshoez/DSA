import java.util.Arrays;

public class insertionSort {
    static void main(String[] args){
        int[] arr = {1,2,3,4,24,153,12};
        int n = arr.length;

        for(int i = 0; i <=n-1; i++){
            int j = i;
            while (j>0 && arr[j-1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
            
        }
        System.out.println(Arrays.toString(arr).replace("]", " ").replace("[", " "));
    }
}
