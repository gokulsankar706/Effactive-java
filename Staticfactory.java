//$Id$
package Cooks;

public class Staticfactory {
	private String name;
	private int age;
	private float height;
	
	private Staticfactory() {}
	
	private Staticfactory(String name, int age, float height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	private Staticfactory(String name) {
		this.name = name;
	}
	private Staticfactory(int age) {
		this.age = age;
	}
	private Staticfactory(float height) {
		this.height = height;
	}
	
	public static Staticfactory setValues(String name, int age, float height) {
		return new Staticfactory(name,age,height);
	}
	public static Staticfactory setName(String name) {
		return new Staticfactory(name);
	}
	public static Staticfactory setAge(int age) {
		return new Staticfactory(age);
	}
	public static Staticfactory setAge( float height) {
		return new Staticfactory(height);
	}

	@Override
	public String toString() {
		return ("Name : "+name+"\nAge :"+age+"\nHeight :"+height);
	}
}
