package Hash;

import java.util.ArrayList;

public class HashTable {
    private int size = 7;
    private Node[] dataMap;

    public HashTable() {
        dataMap = new Node[7];
    }

    public void printTable() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + " : ");
            Node temp = dataMap[i];
            while (temp != null) {
                System.out.println("   {" + temp.getKey() + " = " + temp.getValue() + " }");
                temp = temp.getNext();
            }
        }
    }

    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();

        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            hash = (hash + asciiValue * 23) % dataMap.length;
        }

        return hash;
    }

    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }

    public int get(String key){
        int index = hash(key);

        Node temp = dataMap[index];
        while (temp!=null){
            if(temp.getKey()==key ) {
                System.out.println("EQUAL");
                return temp.getValue();
            }
            System.out.println("NOT EQUAL");
            temp = temp.getNext();
        }
        return 0;
    }

    public ArrayList keys(){
        ArrayList<String> allKeys = new ArrayList<>();

        for(int i=0;i< dataMap.length;i++){
            Node temp = dataMap[i];
            while(temp!=null){
                allKeys.add(temp.getKey());
                temp = temp.getNext();
            }
        }
        return allKeys;
    }
}
