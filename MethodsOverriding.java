//$Id$
package Cooks;

import java.util.HashSet;
import java.util.Set;

public class MethodsOverriding {

	int id;
	int b;
	int c;
	String name;
	public int getId() {
		return id;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	MethodsOverriding(int a,int y, String name){
		this.id = a;
		this.b = y;
		this.name = name;
	}
	
	public static void main(String[] arg) {
		
		Set<MethodsOverriding> set = new HashSet<>();
		MethodsOverriding m1 = new MethodsOverriding(10134534,1,"xyz");
		MethodsOverriding m2 = new MethodsOverriding(10134534,1,"xyz");
		
		set.add(m1);
		set.add(m2);
		
		System.out.println(set);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || obj.getClass() == getClass()) {
			return true;
		}
		if(hashCode() == obj.hashCode()) {
			return true;
		}
		
		MethodsOverriding Obj = (MethodsOverriding) obj;
		if(Obj.getId() == id) {
			return true;
		}
		
		return false;
	}
	
		
	@Override
	public int hashCode() {
		
		int prime = 31;
		int hashValue = 1;
		hashValue *= 31 + id;
		
		return hashValue;
	}
	
	/**
	 * 
	 * @author gokul-13991
	 * <i> name</i> is an Employe name
	 * Emp id : 123 
	 * Age : 12 
	 * name : xyz
	 */
	@Override
	public String toString() {
		return "Emp id :"+id+"\nAge :"+b+" \nname : "+name;
	}
}
	
	
