package LL;

public class LLMain {
    public static void main(String[] args) {
        LinkedList newLinkedList = new LinkedList(5);
        newLinkedList.getHead();
        newLinkedList.getTail();
        newLinkedList.getLength();
        newLinkedList.printList();

        System.out.println(" ");
        System.out.println("---------------------------------");
        newLinkedList.append(10);
        newLinkedList.getHead();
        newLinkedList.getTail();
        newLinkedList.getLength();
        newLinkedList.printList();
        System.out.println(" ");
        System.out.println("---------------------------------");

        System.out.println(newLinkedList.deleteLast().value);
        newLinkedList.getHead();
        newLinkedList.getTail();
        newLinkedList.getLength();
        newLinkedList.printList();
        System.out.println(" ");
        System.out.println("---------------------------------");

        System.out.println(newLinkedList.deleteLast().value);
        System.out.println(" ");
        System.out.println("---------------------------------");


        System.out.println(newLinkedList.deleteLast());
    }
}
