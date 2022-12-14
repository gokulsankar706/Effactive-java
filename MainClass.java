//$Id$
package Cooks;

import java.util.ArrayList;
import java.util.Iterator;

public class MainClass {
	
	public static <N> void main(String[] args) {
				
		//Singleton Using private constuctor
		SingletonPrivateConstructor Obj = SingletonPrivateConstructor.getInstance();
		System.out.println(Obj.toString());
		System.out.println("\nSingleton Using Enum");
		
		//Singleton Using Enum
		SingletonENUM Obj2 = SingletonENUM.INSTANCE;
		SingletonENUM Objj = SingletonENUM.INSTANCE;
		Obj2.setNumber(123); 
		Objj.setNumber(123333);
		System.out.println(Obj2.hashCode()+"\n"+Objj.hashCode()+"\nObject One \n"+Obj2+"\nObject Two \n"+Objj);
		System.out.println("\nStatic factory method");
				
		//Static factory method
		Staticfactory Obj3 = Staticfactory.setValues("gokul", 12, 87.6f);
		Staticfactory Objt = Staticfactory.setValues("ss", 322, 8327.6f).setName("gulu gulu");
		System.out.println(Obj3.hashCode()+"\n"+Objt.hashCode());
		System.out.println(Objt);
		System.out.println("\nBuilder pattern");
		
		//Builder pattern
		BuilderPattern Obj4 = new BuilderPattern();
		BuilderPattern.MobileBuilder Obj5 =Obj4.new MobileBuilder();
		BuilderPattern theMobile = Obj5.setBattery(123).setOS("Mac").setRam(8).getMobile();
		System.out.println(theMobile);
		
		//composition
		System.out.println("\nComposition \n");
		ClassesAndInterfaces ci =  new ClassesAndInterfaces();
		ci.createUser("gokul", 821232423, "23/1/2009", 89976748);
		ArrayList<Composition> userDetails = ci.getUsers();
		Iterator<Composition> itr = userDetails.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		//Abstract Interface or Skeletal Implementation
		System.out.println("\nAbstract Interface or Skeletal Implementation \n");
		Animal lion =  new Lion();  //Refer object by their Interfaces	
		Animal cat = new Cat(); 
		
		lion.callMe();
		System.out.println();
		cat.callMe();
		
		//Generics 
		Generics<Integer> g = new Generics<Integer>();
		g.add(1);
		g.add(5);
		g.add(6);
		g.print();

		
	}

	
}
