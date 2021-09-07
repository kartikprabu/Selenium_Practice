package methods;

public class Car {
	
	int a = 10;
	int b = 20;
	int add = a+b;
	
	public boolean right()
	{
		return true;
	}
	
	public String name()
	{
		return "Kartik";
	}

	public void sum()
	{
		int a = 5;
		int b = 10;
		int c = a+b;
		System.out.println("The sum of A and B is: "+c);
	}
	
	public void sum(int a)
	{
		int x = this.a; 
		System.out.println("Value for A is: "+x);
	}
}
