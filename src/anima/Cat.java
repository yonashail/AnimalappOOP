package anima;

public class Cat extends Animal{

	public Cat() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("Now I am a cat.");
	}
	
	@Override
	
	public String sleep() {
		return "A cat sleeps..";
		}
	@Override
	
	public String eat() {
		return "A cat eats quickly..";
	}
	
	public String Purr() {
		return "Purr...";
		
	}

}
