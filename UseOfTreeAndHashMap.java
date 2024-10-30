import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class UseOfTreeAndHashMap {
    public static void main(String[] args) {
        myTreeMap();
        myHashMap();
    }
    public static void myTreeMap(){
        Map<Integer,String> Tree = new TreeMap<>();
        Tree.put(12, "Tanjim");
        Tree.put(12,  "Monalis");
        Tree.put(4, "Jimmy");
        Tree.put(3, "Liba");
        System.out.println("TreeMap:");
        for (Map.Entry<Integer, String> Jarif : Tree.entrySet()) {
           System.out.println("Key: "+Jarif.getKey()+" Value: "+Jarif.getValue());  
        }
    }
    public static void myHashMap(){
        Map<Integer,String> Hash = new HashMap<>();
        Hash.put(6, "Tanjim");
        Hash.put(6,  "Monalis");
        Hash.put(4, "Jimmy");
        Hash.put(3, "Liba");
        System.out.println("HashMap:");
        for (Map.Entry<Integer, String> Jarif : Hash.entrySet()) {
           System.out.println("Key: "+Jarif.getKey()+" Value: "+Jarif.getValue());  
        }
    }
}