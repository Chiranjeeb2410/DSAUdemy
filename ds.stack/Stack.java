public class Stack	{

	private int maxSize;	// denotes the array/stack size.
	private long[] stackArray;	//denotes the container within which the data is kept.
	private int top;	//	denotes topmost element of stack.

	public Stack(int size)	{
		this.maxSize = size;
		this.stackArray = new long[maxSize];
		this.top = -1;
	}

	public boolean isEmpty()	{
		return (top == -1);	//	checking if stack is empty.
	}
	
	public boolean isFull()	{
		return (top == maxSize -1);	//	condition checking if stack is full.
	}
		
	public void push(int j)	{
		if(isFull())	{
			System.out.println("Stack's already full");
		}		
		else	{
			top++;
		}
	}
	
	public long pop()	{
		if(isEmpty())	{
			System.out.println("Stack's already empty");
		return -1;		
		}
		else	{
			int old_top = top;
			top--;
			return stackArray[old_top];
		}
	}

	public long peak()	{
		return stackArray[top];	//	displays topmost element.
	}

}

