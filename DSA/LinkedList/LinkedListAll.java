package LinkedList;

public class LinkedListAll{

    public static void main(String[] args) {
        LinkedList list = new LinkedList ();

        list.print("append Method :");
        list.append(1);
        list.append(2);
        list.print();

        list.print("insertAfter Method :");
        list.insertAfter(1, 7);
        list.insertAfter(2, 6);
        list.print();

        list.print("prepend Method :");
        list.prepend(0);
        list.prepend(9);
        list.print();

        list.print("delete Method :");
        list.delete(7);
        list.delete(9);
        list.print();
    }    
}

class LinkedList{
    Node head;

    LinkedList(){
        this.head = null;
    }

    public void prepend(int data){
        Node newNode = new Node(data);
        Node currentNode = this.head;
        newNode.next = currentNode;
        this.head = newNode;
    }

    public void append (int data){

        Node newNode = new Node(data);
        Node currentNode = this.head;

        if(currentNode == null){
            this.head = newNode;
            return ;
        }

        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void insertAfter(int prev, int data){

        Node currentNode = this.head;
        Node newNode = new Node (data);


        if( currentNode == null){
            this.head = newNode;
            return ;
        }

        while(currentNode.data != prev && currentNode.next!= null){
            currentNode = currentNode.next;
        }

        Node nextNode = currentNode.next;
        currentNode.next= newNode;
        newNode.next = nextNode;
    }

    public void print(){
        Node currentNode = this.head;
        while(currentNode != null){
            System.out.print(currentNode.data + "------>");
            currentNode= currentNode.next;
        }
        System.out.println();
    }

    public void print(String s){
        System.out.print(s+" ");
    }

    public void delete (int data){
        Node currentNode = this.head;
        Node prevNode = currentNode;

        if(currentNode.data ==data){
            this.head =currentNode.next;
        }
        
        while( currentNode!= null && currentNode.data !=data){
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        prevNode.next = currentNode.next;

    }

}
class Node{
    int data;
    Node next;

    Node(int data){
        this.data= data;
        this.next = null;
    }
}