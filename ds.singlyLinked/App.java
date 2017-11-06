public class App    {

    public static void main(String[] args)  {

        SinglyLinkedList theList = new SinglyLinkedList();
        theList.insertFirst(100);
        theList.insertFirst(99);

        theList.displayList();
        System.out.println();
    }
}