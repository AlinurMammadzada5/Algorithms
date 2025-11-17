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
    public Node removeLast(){
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
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }  else{
            newNode.next = head;
            head = newNode;
        }
length++;
    }

    public Node removeFirst(){
        if(length == 0){return null;}


            Node temp = head;
            head = head.next;
            temp.next =  null;
            length--;
            if(length==0){tail=null;}
            return temp;
    }

    public Node get(int index){
        if(index < 0 || index > length){return null;}
        if(length == 0){return null;}
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }
    public boolean set(int index, int value){
        if(index < 0 || index > length){return false;}
        if(length == 0){return false;}
        Node temp = get(index);
        temp.value = value;
        return true;
    }
    public boolean insert(int index, int value){
        if(index < 0 || index > length){return false;}
        if(length == 0){prepend(value); return true;}
        if(length==index){append(value); return true;}
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next = temp.next;
        temp.next = newNode;
        length ++;
        return true;



    }

    public Node delete(int index){
        if(index < 0 || index > length){return null;}
        if(index == 0){return removeFirst();}
        if(index == length-1){return removeLast();}
        Node prev = get(index-1);
        Node temp = prev.next;
        prev.next = temp.next;
       temp.next = null;
       length --;
      return temp;
    }

    public void reverse(){
        if(length == 0){return;}
        Node temp = head;
        head = tail;
        tail = temp;
        Node  after = temp.next;
        Node before = null;
        for(int i = 0;i<length;i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

                     /* InterView Question*/
    public void reverseBetween(int startIndex,int endIndex){
        if(head==null){return;}
        Node dummy = new Node(0);
        dummy.next=head;
        Node prev= dummy;
        Node current;
        for(int i=0;i<startIndex;i++){
            prev=prev.next;
        }
        System.out.println("Prev Value: " +prev.value);
        current=prev.next;
        for(int i=0;i<(endIndex-startIndex);i++){
            Node nodeToMove = current.next;
            current.next=nodeToMove.next;
            nodeToMove.next=prev.next;
            prev.next=nodeToMove;
        }
        head=dummy.next;
    }
    public void partitionList(int x){
        if(head==null){return;}
        Node dummy1=new Node(0);
        Node dummy2=new Node(0);
        Node curr1=dummy1;
        Node curr2=dummy2;
        Node curr=head;
        while(curr!=null){
            if(curr.value<x){
                curr1.next=curr;
                curr1=curr;
            } else if(curr.value>=x){
                curr2.next=curr;
                curr2=curr;
            }
            curr=curr.next;
        }
        curr2.next=null;
        curr1.next=dummy2.next;
        head=dummy1.next;
    }

    public int binaryToDecimal(){
        Node curr=head;
        int sum=0;
        while(curr!=null){
            sum=sum*2+curr.value;
            curr=curr.next;
        }
        return sum;
    }
    public void removeDuplicates(){   //Right Now it is O(n^2) with HashMap it can found with O(n) when learning HashMap efficiently I will use that one
        if(head==null){return;}
        Node curr=head;
        Node checker;
        while(curr!=null){
            checker=curr;
            while(checker.next!=null){
                if(checker.next.value==curr.value){
                    checker.next = checker.next.next;
                    length--;
                }else{
                    checker=checker.next;
                }
            }
            curr=curr.next;
        }
    }

    public Node findKthFromEnd(int k) {
        if (k < 0) {
            return null;
        }
        Node fast = head;
        Node slow = head;
        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }

    public boolean hasLoop(){
        Node fast=head;
        Node slow=head;

        while((fast!=null && fast.next!=null)){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) return true;
        }
        return false;
    }

    public Node findMiddleNode(){
        if(head==null){return null;}
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next !=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }

    public void swapPairs() {
        if(head==null) return;
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        Node first = prev.next;
        // Node second = first.next;   if we do this and inside while when we do second=first.next sometimes we can have first as null, and first.next will be null pointer exception
        //so it is best to create node second inside while loop

        while(first!=null && first.next !=null){
            Node second = first.next;

            prev.next = second;
            first.next = second.next;
            second.next = first;


            prev=first;
            //   second = first.next;
            first = prev.next;
        }
        head = dummy.next;
    }




    }

