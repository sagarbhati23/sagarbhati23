// Implementation of singly linkedlist
public class LL2 {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // add first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head ==null){
            head = newNode;
            return;
        }
        
        newNode.next = head;
        head = newNode;
    }

    // add last
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // print the list
    public void printlist(){
        if (head == null){
            System.out.println("list is empty");
            return;
        } 

        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + " ");
        }

        System.out.println();
    }

    // delete first
    public void deleteFirst(){
        if (head==null){
            System.out.println("The list is empty");
            return;
        }
        
        head = head.next;
    }

        public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("4");
        list.addFirst("3");
        list.addFirst("2");
        list.addFirst("1");

        list.printlist();
        
        list.addLast("5");
        list.printlist();

        // list.deleteFirst();
        // list.printlist();
        
        list.deleteLast();
        list.printlist();

    
    }    
}
