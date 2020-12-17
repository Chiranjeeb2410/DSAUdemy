public class CircularLinkedList {

    public Node first;
    public Node last;

    public boolean isEmpty()    {
        return (first == null);
    }
    public void insertFirst(int data)   {
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty())   {
            last = newNode;
        }

        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int data)    {
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty())   {
            first = newNode;
        }
        else    {
            last.next = newNode;
            last = newNode;
        }
    }

    public Node deleteFirst()    {
        Node temp = first;
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