public class NodeApp    {

    public static void main(String[] args)  {

        Node node1 = new Node(); // head node
        node1.data = 1;

        Node node2 = new Node();
        node2.data = 2;

        Node node3 = new Node();
        node3.data = 3;

        Node node4 = new Node();
        node4.data = 4;

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;


        System.out.println(listLength(node1));
        System.out.println(listLength(node2));

    }

    public static int listLength(Node aNode)   {
        int count = 1;
        Node currentNode = aNode;

        while(currentNode.next != null) {
            count++;
            currentNode = currentNode.next;
        }

        return count;
    }

}