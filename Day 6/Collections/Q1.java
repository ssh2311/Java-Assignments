import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Q1 {

    public static List<Integer> sortVal(HashMap<Integer, Integer> map) {
        List<Integer> valuesList = new ArrayList<>(map.values());
        Collections.sort(valuesList);
        return valuesList;
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 25);
        map.put(2, 5);
        map.put(3, 15);
        map.put(4, 30);
        map.put(5, 20);
        map.put(6, 10);

        System.out.println("Original Values: " + map);
        List<Integer> sortedValues = sortVal(map);
        System.out.println("Sorted Values: " + sortedValues);
    }
}
