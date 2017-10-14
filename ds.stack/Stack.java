public class Stack  {

    public int maxSize; // size of array
    public int[] stackArray;  //elements of the created array
    public int top; //  top element

    public Stack(int size)  {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        top = -1;
    }

    void push(int p)    {
        if(isFull())    {
            System.out.println("Stack overflow!");
        }
        else    {
            top++;
            stackArray[top] = p;
        }
    }

    int pop()  {
        if(isEmpty())   {
            return -1;
        }
        else    {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
    }

    boolean isEmpty()   {
        return (top == -1);
    }

    boolean isFull()    {
        return (maxSize - 1 == top);
    }

}