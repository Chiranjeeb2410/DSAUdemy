public class App    {

    public static void main(String[] args)  {
        Stack d = new Stack(5);
        d.push(10);
        d.push(20);
        d.push(30);
        d.push(40);
        d.push(50);
        d.pop();
        d.push(60);
        d.push(50);
        d.pop();

        while(!d.isEmpty())    {
            int value = d.pop();
            System.out.println(value);
        }
    }

}