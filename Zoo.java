public class Zoo	{
	
	public static void main(String args[])	{

		Animal animal1 = new Animal("Fox", 15, 157);
		Animal animal2 = new Animal("Lion", 20, 160);
	
		animal1.speak();
		animal2.eat();

		Bird bird1 = new Bird();
		bird1.fly();

	}

}

