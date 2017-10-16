public class NodeApp    {

    public static void main(String[] args)  {

        Node nodeA = new Node(); // head node
        nodeA.data = 1;

        Node nodeB = new Node();
        nodeB.data = 2;

        Node nodeC = new Node();
        nodeC.data = 3;

        Node nodeD = new Node();
        nodeD.data = 4;

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;


        System.out.println(listLength(nodeA));
        System.out.println(listLength(nodeB));

    }

    public static int listLength(Node aNode)   {
        int count;
        Node currentNode = aNode;

        while(currentNode.next != null) {
            count++;
            currentNode = currentNode.next;
        }
    }

}