package constructor;

public class CallConstructor {

	public static void main(String[] args) {
		
		Learner ls = new Learner();
		String ab = ls.print("100");
		System.out.println(ab);
		ls.right();
		ls.sum();
		ls.sum(10, 20);
	}

}
