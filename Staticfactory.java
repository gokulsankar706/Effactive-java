//$Id$
package Cooks;

public class Staticfactory {
	private String name;
	private int age;
	private float height;
	
	private Staticfactory() {
		
	}
	private Staticfactory(String name, int age, float height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public static Staticfactory setValues(String name, int age, float height) {
		return new Staticfactory(name,age,height);
	}

	@Override
	public String toString() {
		return ("Name : "+name+"\nAge :"+age+"\nHeight :"+height);
	}
}
