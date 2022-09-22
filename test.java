//$Id$
package Cooks;

import java.util.*;

public class test {

//	Don't use raw types 
//	Eliminate unchecked warnings
//	Prefer list to array
//	Favor generic types and methods 
//	Use bounded wildcards to increase API flexibility
	public static void main(String arg[]) {
		
		Set<Integer> set = new HashSet<>(); //Parameterized type
		Set<String> strSet = new HashSet<>(); 
		 method(set);
		
		 Bounded<String> obj = new Bounded<String>("dfghbj");
		 		
	}
	
	static void method(Set<? extends Number> set) { //wildcard type 
		
	}
	
}