public class Animals	{

	String name;
	int age;
	int heightInInches;

	public Animal(String name, int age, int heightInInches)	{
		super();
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
	}

	public void speak()	{
		System.out.println("The animal is " + name);
		System.out.println("It's age is " + age + " and height is " + heightInInches);
	}

	public void eat()	{
		System.out.println("Eating...");
	}
	
	public void move()	{
		System.out.println("Moving...");
	}

}

