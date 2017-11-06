public class SinglyLinkedList   {

    public Node first;

    public boolean isEmpty()    {
        return (first == null);
    }

    public void insertFirst(int data)   {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public Node deleteFirst()   {
        if(isEmpty())   {
            return null;
        }
        else {
            Node temp = first;
            first = first.next;
            return temp;
        }
    }

    public void insertLast(int data)    {
        Node currentNode = first;
        while(currentNode.next != null)  {
            currentNode = currentNode.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        currentNode.next = newNode;
    }

    public void displayList()   {
        System.out.println("The list is: ");
        Node currentNode = first;
        while(currentNode.next != null)  {
            currentNode.displayNode();
            currentNode = currentNode.next;
        }
        System.out.println();
    }

}