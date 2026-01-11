public class printbackTrack {
    static void print(int i, int n){
        if(i < 1){
            return;
        }
        print(i - 1, n);
        System.out.println(i);
    }
    static void main(String[] args){
        print(5,5);
    }
}

// TO PRINT BACKWARDS FROM N TO 1 USING BACKTRACKING

// public class printbackTrack {
//     static void print(int i, int n){
//         if(i > n){
//             return;
//         }
//         print(i + 1, n);
//         System.out.println(i);
//     }
//     static void main(String[] args){
//         print(1,5);
//     }
// }
