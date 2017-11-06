public class DoublyLinkedList   {

    public Node first;
    public Node last;

    public void insertFirst(int data)   {
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty())   {
            last = newNode;
        }
        else    {
            first.previous = newNode;
        }

        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int data)   {
        Node newNode = new Node();
        newNode.data = data;
        if(isEmpty())   {
            first = newNode;
        }
        else    {
            last.next = newNode;
            newNode.previous = last;
        }
        this.last = newNode;
    }

    //assume non-empty list
    public Node deleteFirst()    {
        Node temp = first;
        if(first.next == null)   {
            last = null;
        }
        else    {
            first.next.previous = null;
        }
        first = first.next;
        return temp;
    }

    //assume non-empty list
    public Node deleteLast()    {
        Node temp = last;
        if(first.next == null)  {
            first = null;
        }
        else    {
            last.previous.next = null;
        }
        last.previous = last;
        return temp;
    }

    //assume non-empty list
    public boolean insertAfter(int key, int data)   {
        Node currentNode = first;
        while(currentNode.data != key) {
            currentNode = currentNode.next;
            if(currentNode.next == null)    {
                return false;
            }
        }
        Node newNode = new Node();
        newNode.data = data;
    }

}