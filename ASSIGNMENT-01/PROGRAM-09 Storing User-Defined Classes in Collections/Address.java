import java.util.*;
class  Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;
    
    Address(String n, String s, String c, String st, String cd) {
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }
    public String toString() {
        return name + "\n" + street + "\n" + city + " " + state + " " + code; }
}

class MailList {
    public static void main(String args[]){
        LinkedList<Address> ml = new LinkedList<Address>();
        ml.add(new Address("Shammo Siddik", "Morbi Highway", "Rajkot", "Gujarat", "360003"));
        ml.add(new Address("Sabrina Akhter", "Malo Para", "Nawabganj", "Rajshahi", "6300"));
        for(Address element : ml)
            System.out.println(element + "\n");
            System.out.println();
    }
}
