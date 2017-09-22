package adt;

public abstract class Counter	{
	private String name = null;
	private int num = 0;
	
	public Counter(String str)	{
		super();
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

