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
        newLinkedList.prepend(25);
        newLinkedList.printList();
        System.out.println(" ");
        System.out.println("---------------------------------");
        //System.out.println(newLinkedList.get(2));


        //SET METHOD
newLinkedList.set(1,15);
newLinkedList.insert(1,20);
newLinkedList.reverse();
        newLinkedList.printList();

        //Delete First Method Check
//        newLinkedList.deleteFirst();
//        newLinkedList.printList();
//        System.out.println("---------------------------------");
//        newLinkedList.deleteFirst();
//        newLinkedList.printList();
//        System.out.println("---------------------------------");
//        newLinkedList.deleteFirst();
//        newLinkedList.printList();
//        System.out.println("---------------------------------");




        /*Removing Part*/
//        System.out.println(newLinkedList.deleteLast().value);
//        newLinkedList.getHead();
//        newLinkedList.getTail();
//        newLinkedList.getLength();
//        newLinkedList.printList();
//        System.out.println(" ");
//        System.out.println("---------------------------------");

//        System.out.println(newLinkedList.deleteLast().value);
//        System.out.println(" ");
//        System.out.println("---------------------------------");


//        System.out.println(newLinkedList.deleteLast());
    }
}
