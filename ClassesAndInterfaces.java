//$Id$
package Cooks;

public class ClassesAndInterfaces{
	
	Composition Obj = new Composition();
	public void f() {
		System.out.println("hello...i am F");
	}
	
	public void g() {
		System.out.println("hello...i am G");
	}
	
	public void h() {
		System.out.println("hello...i am H");
	}
	
	public void callA() {
		Obj.a();
	}
	
	public void callB() {
		Obj.ba();
	}
	
	public void callC() {
		Obj.ca();
	}
	
	
}
