package methods;

public class Mycar{

	public static void main(String[] args) {
		
		Car c = new Car();
		
		boolean rw = c.right();
		System.out.println(rw);
		
		String n = c.name();
		System.out.println("The name is: "+n);
		
		c.sum();
		
		System.out.println(c);
		
		c.sum(30);
	}

}
