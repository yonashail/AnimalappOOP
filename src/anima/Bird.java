package anima;

public class Bird extends Animal {

	public Bird() {
		// TODO Auto-generated constructor stub
		//superclass
		
		System.out.println("A Bird is hatched..");
	}
	@Override
	public String sleep() {
		return "A Bird sleeps soundly...";
		
	}
	@Override
	public String eat() {
		return "A bird eats..";
	}
	public String fly() {
		return "A bird fly....";
	}
	
	}

