//$Id$
package Cooks;
public class MainClass {

	public static void main(String[] args) {
		
		//Singleton Using private constuctor
		SingletonPrivateConstructor Obj = SingletonPrivateConstructor.getInstance();
		System.out.println(Obj.toString());
		System.out.println("\nSingleton Using Enum");
		
		//Singleton Using Enum
		SingletonENUM Obj2 = SingletonENUM.INSTANCE;
		Obj2.setNumber(123);
		System.out.println(Obj2);
		System.out.println("\nStatic factory method");
				
		//Static factory method
		Staticfactory Obj3 = Staticfactory.setValues("gokul", 12, 87.6f);
		System.out.println(Obj3);
		System.out.println("\nBuilder pattern");
		
		//Builder pattern
		BuilderPattern Obj4 = new BuilderPattern();
		BuilderPattern.MobileBuilder Obj5 =Obj4.new MobileBuilder();
		BuilderPattern theMobile = Obj5.setBattery(123).setOS("Mac").setRam(8).getMobile();
		System.out.println(theMobile);
		
	}

}
