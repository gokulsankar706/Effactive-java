//$Id$
package Cooks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

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
		
		methods m1 = new methods(1,2,"dfg");
		methods m2 = new methods(3,2,"dfg");
		Set<methods> set = new HashSet<>();
		
		set.add(m1);
		set.add(m2);
		
		//System.out.println(m1.hashCode()+" "+m2.hashCode());
		System.out.println(set);
		if (m1.getStr().equals(m2.getStr())) {
			//System.out.println("hello,.....");
		}
		else {
			//System.out.println("false...");
		}
		
	}
	
	
	//Overriding equals and hashcode
	@Override
	public boolean equals(Object obj) {
		methods m = (methods) obj;
		if(this.k == m.k || m.hashCode() == this.hashCode())
			return true;
		
		return false;
		
	}
	
	@Override
	public int hashCode() {
		int prime = 31;
		int result= 1;
		result *= prime + k;
		return result;
	}
	
	
}
