public class NewHuman	{

	String name;
	int age;
	int heightInInches;
	String eyeColor;

	public NewHuman(String name, int age, int heightInInches, String eyeColor)	{
		super();
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
	}

	void speak()	{
		System.out.println("Hello, my name is " + name);
	}

	void eat()	{
		System.out.println("Eating...");
	}

	void walk()	{
		System.out.println("Walking....");
	}

	void height()	{
		System.out.println("My height is " + heightInInches + " cms");
	}

}
	
