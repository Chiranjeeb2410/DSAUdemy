package adt;

public class Counter	{
	String name = null;
	int num = 0;
	
	public Counter(String str)	{
		this.name = str;
	}
	
	public void increment()	{
		num++;
	}

	public int getCurrentValue()	{
		return num;
	}
	
	public String toString()	{
		return name + ": " + num;
	}

}

