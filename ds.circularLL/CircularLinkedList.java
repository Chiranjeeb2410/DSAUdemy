public class CircularLinkedList {

    private Node first;
    private Node last;

    public CircularLinkedList() {
        this.first = null;
        this.last = null;
    }

    public void insertFirst(int data)   {
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty())   {
            last = newNode;
        }
        newNode.next = first; // newNode --> old_first
        first = newNode;    // first place
    }

    public void insertLast(int data) {
        New newNode = new Node();
        newNode.data = data;
        if(isEmpty())   {
            first = newNode;
        }
        else    {
            last.next = newNode;
            last = newNode;
        }
    }

    public int deleteFirst()    {
        int temp = first.data;
        if(first.next == null)  {
            last = null;
        }

        first = first.next;
        return temp;
    }

    public void displayList()   {
        System.out.println("The list is: ");
        Node currentNode = first;
        while(currentNode != null)  {
            currentNode.displayNode();
            currentNode = currentNode.next;
        }
        System.out.println();
    }

}