public class App    {

    public static void main(String[] args)  {

        CircularLinkedList myList = new CircularLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(99);
        myList.insertFirst(80);
        myList.insertFirst(70);
        myList.insertFirst(60);
        myList.insertLast(80);
        myList.deleteFirst();

        myList.displayList();
        System.out.println();
    }
}