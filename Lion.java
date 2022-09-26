//$Id$
package Cooks;

public class Lion extends CatFamily{
	@Override
	public void food() {
		System.out.println("I am only eat non-veg...");
	}

	@Override 
	public void home() {
		System.out.println("wild is under my kingdome 😎");
	}

	@Override
	public void sound() {
		System.out.println("i'll Rore.....");		
	}

	public void callMe() {
		System.out.println("I am "+Animal.animals.lion);
		family();
		home();
		food();
		sound();
		legs();
	}
}
