public class printCountBack {
    static void print(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        print(i-1,n);
    }

    static void main(String[] args){
        print(5,5);
    }
}
