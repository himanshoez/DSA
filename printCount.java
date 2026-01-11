public class printCount {
    static void print(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        print(i+1,n);
    }
    static void main(String[] args){
        print(1,5);
    }
}
