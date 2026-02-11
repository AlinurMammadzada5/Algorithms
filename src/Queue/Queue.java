package Queue;

public class Queue {
    private Node first;
    private Node last;
    private int size;

    public Queue (int value) {
        Node node = new Node(value);
        first = node;
        last = node;
        size = 1;
    }

    public void enQueue (int value) {
        Node node = new Node(value);
        if (size == 0) {
            first = node;
            last = node;
        }  else {
            last.next = node;
            last = node;
        }
        size++;
    }
    public Node deQueue () {
        if (size == 0) {return null;}
        Node temp  = first;
        if(size == 1) {first =null;last = null;}
        else{
            first = first.next;
            temp.next = null;
        }

        size--;
        return temp;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void printQueue(){
        Node temp = first;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
