public class App	{

	public static void main(String args[])	{

		Stack newStack = new Stack(3);
		newStack.push(10);
		newStack.push(20);
		newStack.push(30);
		
		while(!newStack.isEmpty())	{
			long value = newStack.pop();
			System.out.println(value);
		}
	}

}

