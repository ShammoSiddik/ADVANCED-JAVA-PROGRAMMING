import java.util.TreeMap;
import java.util.*;
class TreeMapDemo {
    public static void main(String args[]) {
        TreeMap<String, Double> tm = new
        TreeMap<String, Double>();
        tm.put("Shammo Siddik", Double.valueOf(3434.34));
        tm.put("Sabrina Akhter", Double.valueOf(123.22));
        tm.put("Shadhin Siddik", Double.valueOf(1378.00));
        tm.put("Selima Daizy", Double.valueOf(99.22));
        tm.put("Shio Sabu", Double.valueOf(-19.08));

        Set<Map.Entry<String, Double>> set = tm.entrySet();
        for(Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() +  ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = tm.get("Shammo Siddik");
        tm.put("Shammo Siddik", balance + 1000);
        System.out.println("Shammo Siddik's new balance: " + tm.get("Shammo Siddik"));
    }
}

