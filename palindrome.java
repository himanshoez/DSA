import java.util.Scanner;

public class palindrome {
    static boolean checkPalindrome(String word, int i, int n){ 
        if(i >= n/2) return true;
        if (word.charAt(i) != word.charAt(n - i -1) )
            return false;

        return checkPalindrome(word, i + 1, n);

    }

    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String word = sc.next();
        int n = word.length();

        System.out.println(checkPalindrome(word, 0, n));
    }
}
