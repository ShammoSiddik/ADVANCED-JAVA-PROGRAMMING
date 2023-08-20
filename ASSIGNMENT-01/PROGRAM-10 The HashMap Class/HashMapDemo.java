import java.util.HashMap;
import java.util.*;
class HashMapDemo {
    public static void main(String args[]) {
        HashMap<String, Double> hm = new
        HashMap<String, Double>();
        hm.put("Shammo Siddik", Double.valueOf(3434.34));
        hm.put("Sabrina Akhter", Double.valueOf(123.22));
        hm.put("Shadhin Siddik", Double.valueOf(1378.00));
        hm.put("Selima Daizy", Double.valueOf(99.22));
        hm.put("Shio Sabu", Double.valueOf(-19.08));

        Set<Map.Entry<String, Double>> set = hm.entrySet();
        for(Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() +  ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = hm.get("Shammo Siddik");
        hm.put("Shammo Siddik", balance + 1000);
        System.out.println("Shammo Siddik's new balance: " + hm.get("Shammo Siddik"));
    }
}