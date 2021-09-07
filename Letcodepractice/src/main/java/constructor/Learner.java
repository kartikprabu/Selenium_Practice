package constructor;

public class Learner {
	
	String fname;
	int a;
	Boolean t;
	float k;
	int d;
	char c;

	public String print(String lname)
	{
		this.fname = "Kartik";
		return "Prabu";
	}
	
	Boolean right()
	{
		return true;
	}
	
	public void sum()
	{
		System.out.println("1st SUM method");
	}
	public void sum(int a,int d)
	{
		this.k = 12.4f;
		this.d = 23;
		this.a = 22;
		int add = this.d + this.a;
		System.out.println(add);
		System.out.println(a+d);
	}
	
	
}
