package Hash;

public class HashMain {

    public static void main(String[] args){
        HashTable ht = new HashTable();
        ht.printTable();
        ht.set("Istanbul",30);
        ht.printTable();
        ht.set("nails",100);
        ht.set("tile",50);
        ht.printTable();
        System.out.println("---------------------------");
       // System.out.println(ht.get("tile"));
        System.out.println(ht.keys());
    }
}
