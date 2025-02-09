class LL{
    Node head;
    private int size;
    LL(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }


    // add first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }


    // add last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }
    

    // print list
    public void printlist(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    // delete first
    public void deleteFirst(){
        if (head == null){
            System.out.println("This list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void deleteLast(){
        if (head == null){
            System.out.println("This list is empty");
            return;
        }

        size--;

        if (head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next; 
        }
        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printlist();

        list.addLast("list");
        list.printlist();

        list.addFirst("this");
        list.printlist();

        list.deleteFirst();
        list.printlist();

        list.deleteLast();
        list.printlist();

        System.out.println(list.getSize());
        
    }
}