import java.util.HashMap;
import java.util.Map;

public class Q2 {

    static Map<Character, Integer> getCharCount(char[] ar) {
        Map<Character, Integer> m = new HashMap<>();
        for (char c : ar) {
            if (m.containsKey(c)) {
                m.put(c, m.get(c) + 1);
            } else {
                m.put(c, 1);
            }
        }
        return m;
    }

    public static void main(String[] args) {
        char[] ch = { 'a', 'm', 'a', 'z', 'o', 'n' };
        Map<Character, Integer> ansMap = getCharCount(ch);
        System.out.println(ansMap);
    }
}
