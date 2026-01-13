public class hashingBasics {
    static int hashingFor(int cnt, int num, int[] arr){
        
        for(int i = 0; i < arr.length; i++ ){
            if (arr[i] == num){
                cnt++;
            }
        }
            return cnt;
    }


    static void main(String[] args){
        int num = 5;
        int[] arr = {5,4,2,4,43,4,5,6,5,5,5};
        int result = hashingFor(0,num,arr);
        System.out.println(result);
        }
    
}
