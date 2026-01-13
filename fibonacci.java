import java.util.Scanner;

public class fibonacci {
    static int fibo(int n){
        if(n <= 1)
            return n;

    return (fibo(n - 1) + fibo (n - 2));
    }

    static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series:");
        for(int i = 0; i < n; i++){
            System.out.println(fibo(i));
        }
        
    }

}
