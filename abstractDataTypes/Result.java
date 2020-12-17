package adt;

public class Result	{

	public static void main(String[] args)	{
		
		Counter myCounter = new Counter("myCounter");
		myCounter.increment();
		myCounter.increment();
		myCounter.increment();
		myCounter.increment();

		System.out.println(myCounter.getCurrentValue());
	}

}

