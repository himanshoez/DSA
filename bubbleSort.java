import java.util.Arrays;

public class bubbleSort {
    static void main(String[] args){
        int[] arr = {1,2,3,4,24,153,12};
        int n = arr.length;

        for(int i = n-1; i >=1; i--){
            for(int j = 0; j <= i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
                
            }
        }
        System.out.println(Arrays.toString(arr).replace("]", " ").replace("[", " "));
    }
}
