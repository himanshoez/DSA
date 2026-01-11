public class sumNterms {
    // Parametrised
    // static int sumN(int i, int sum){
    //     if(i < 1){
    //         return sum;
    //     }
    //     return sumN(i - 1, sum + i);
    // }

    // FUNCTIONAL
    static int sumN(int n){
        if(n==0){
            return 0;
        }
        return n + sumN(n - 1);
    }
    static void main(String[] args){
        System.out.println(sumN(3));
    }


}
