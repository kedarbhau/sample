package javaproject.test;

public class HelloWorld {
	static String name = "Test";
	
	public HelloWorld() 
	{
		name = new String("Constructor");
		//name = new String("Constructor again");
	}
	public HelloWorld(String nameChange)
	{
		name = nameChange;
	}

	public static void main(String[] args) 
	{
		HelloWorld hello = new HelloWorld();
		System.out.println("Hello World - This is first Java program\n" + name);
	}

}
