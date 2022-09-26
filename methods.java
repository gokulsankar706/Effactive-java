//$Id$
package Cooks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

public class methods{
	
	int k, j, l;
	String str;
	methods(int k, int j, String str){
		this.k = k;
		this.j = j;
		this.str = str;
	}
	void setVal(int val) {
		this.k = val;
	}
	
	int getVal() {
		return k;
	}
	
	String getStr() {
		return str;
	}
	
	static void callMe(ArrayList<String> list) {
		Object obj = Objects.requireNonNull(list, "The list should not be null.....");
		
		System.out.println(obj);
	}
	public static int val() {
		return 1;
	}
	
	private static void asserts(int a) {
		assert(a != 0) : val();
		System.out.println("hello.....");
	}
	
	static void printArray(String s,int... array) {
		System.out.println(s+" size is"+array.length);
	}
	
	static Optional<Integer> opt(ArrayList<Integer> list){
		return Optional.ofNullable(list.get(2));
	}
	
	//java doc
	/**
	 * @return String
	 * @author gokul-13991
	 * @param name
	 */
	
	static void javaDoc(String name) {
		System.out.println("Hello...."+name+":)");
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("xyz");
		//callMe(null);
		
		//asserts(0);	
		
		//printArray("xyz",1,2,3,4,5,6,7,8,7);
		
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.add(1234);
		n.add(65432);
		n.add(null);
		//System.out.println(opt(n));
		
		//javaDoc("xyz ");
		

		
	}
	
	
	
	
	
}
