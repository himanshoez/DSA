import java.util.HashMap;
import java.util.Map;

public class characterHashing {
    public static void main(String[] args) {

        String s = "abaskieoaksdfoa";
        char[] arr = s.toCharArray();

        Map<Character, Integer> hash = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
        }

        // Optional: print result
        for (Map.Entry<Character, Integer> entry : hash.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
