public class App    {

    public static void main(String[] args)  {

        SinglyLinkedList theList = new SinglyLinkedList();
        theList.insertFirst(10);
        theList.insertFirst(20);
        theList.insertFirst(30);
        theList.insertFirst(40);
        theList.insertFirst(50);
        theList.insertLast(60);
        theList.insertLast(70);
        theList.insertLast(80);

        theList.deleteFirst();

        CircularLinkedList myList = new CircularLinkedList();
        myList.insertFirst(10);
        myList.insertFirst(20);
        myList.insertFirst(30);
        myList.insertFirst(40);
        myList.insertFirst(50);

        theList.displayList();
        System.out.println();
        myList.displayList();
    }
}