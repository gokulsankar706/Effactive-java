//$Id$
package Cooks;

public class Cat extends CatFamily{

	@Override
	public void food() {
		System.out.println("I'll eat veg and non-veg...");
	}

	@Override
	public void home() {
		System.out.println("human's home and wild are my home");
	}

	@Override
	public void sound() {
		System.out.println("Meoww,,,,is my voice !-)");		
	}

	public void callMe() {
		System.out.println("I am "+Animal.cat);
		family();
		home();
		food();
		sound();
		legs();
	}
}
