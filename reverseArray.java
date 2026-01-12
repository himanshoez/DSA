import java.util.Scanner;

public class reverseArray {

    static void swap(int[] arr, int n, int i) {
        if(i >= n / 2){
            return;
            }
        

        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        swap(arr, n, i + 1);
        
    }

    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); //Takes the size of the array
        
        int[] arr = new int[n]; // constructs an array of size n

        // Takes n inputs from the user
        System.out.println("Input Array:");
        for(int i = 0; i<n; i++){
            arr[i] =  sc.nextInt();
        }

        swap(arr, n, 0);
        System.out.println("Reverse Array:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        //Prints n inputs taken
        // for(int i = 0; i<n; i++){
        //     System.out.print(arr[i] + " ");
        // }



    }
}
