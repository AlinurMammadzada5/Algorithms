package Arrays;

public class Main {
    public static void main(String[] args) {
        Arrays arr = new Arrays(1);
        arr.insert(5);
        arr.printArray();
        arr.insert(10);
        arr.printArray();


        arr.insert(30);
        arr.printArray();

        arr.removeAt(3);
        arr.printArray();

        System.out.println(arr.indexOf(100));
    }
}
