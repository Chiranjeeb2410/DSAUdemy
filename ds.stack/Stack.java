public class Stack  {

    public int maxSize; // size of array
    public char[] stackArray;  //elements of the created array
    public int top; //  top element

    public Stack(int size)  {
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        top = -1;
    }

    void push(char p)    {
        if(isFull())    {
            System.out.println("Overflow");
        }
        else    {
            top++;
            stackArray[top] = p;
        }
    }

    char pop()  {
        if(isEmpty())   {
            return ' ';
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