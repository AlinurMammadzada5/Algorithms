package LL;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
    public void getHead(){
        System.out.println("Head : "+head.value);
    }
    public void getTail(){
        System.out.println("Tail : "+tail.value);
    }
    public void getLength(){
        System.out.println("Length : "+length);
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    public Node deleteLast(){
     if(length == 0){return null;}
     Node temp = head;
     Node pre = head;
     while(temp.next != null){
         pre = temp;
         temp = temp.next;
     }
     tail = pre;
     tail.next = null;
     length--;
     if(length == 0){head = null;tail = null;}
     return temp;
    }
}
