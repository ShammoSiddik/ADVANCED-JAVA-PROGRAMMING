import java.util.*;
class Main {
    public static void main(String args[])
    //create an array list
    { ArrayList<Integer> al = new ArrayList<Integer>();
        //add elements to the array list
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println("Content of al: " + al);
        //get the array
        Integer ia[] = new Integer[al.size()];
        ia = al.toArray(ia);
        int sum = 0;
        for(int i : ia) sum += i;
        System.out.println("Sum is: " + sum);
    }
}
