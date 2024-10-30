// Importing required classes
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Adding elements to HashMap
        hashMap.put(3, "Banana");
        hashMap.put(1, "Apple");
        hashMap.put(4, "Mango");
        hashMap.put(2, "Orange");

        // Displaying elements of HashMap (order is not guaranteed)
        System.out.println("HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding elements to TreeMap
        treeMap.put(3, "Banana");
        treeMap.put(1, "Apple");
        treeMap.put(4, "Mango");
        treeMap.put(2, "Orange");

        // Displaying elements of TreeMap (elements are sorted by keys)
        System.out.println("\nTreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
