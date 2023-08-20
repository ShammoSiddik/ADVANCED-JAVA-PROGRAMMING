import java.util.TreeMap;
import java.util.*;

class TComp implements Comparator<String> {
    public int compare(String a, String b) {
        int i, j, k;
        String aStr, bStr;
        aStr = a;
        bStr = b;
         i= aStr.lastIndexOf(' ');
         j = bStr.lastIndexOf(' ');
         k = aStr.substring(i).compareTo(bStr.substring(j));
         if(k==0)
         return aStr.compareTo(bStr);
         else
         return k;
    }
}

class Main {
    public static void main(String args[]) {
        TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComp());

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