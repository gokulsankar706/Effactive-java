//$Id$
package Cooks;

import java.util.ArrayList;
import java.util.Iterator;

public class loops{
	int n;
	int k;
	
	loops(int k, int j){
		this.k = k;
		this.n = j;
	}
	
	loops(int k){
		this.k = k;
	}
	
	public void setN(int l) {
		 this.n = l;
	 }
	public int getN() {
		return n;
	}
	
	static int sum(int... args) {
		int sum = 0;
		for (int arg : args)
		sum += arg;
		return sum;
	}
	public static void main(String arg[]) {
		
		 
	ArrayList<String> list = new ArrayList<String>();
	list.add("xyz");
	list.add("xyz");
	list.add("xyt");
	list.add("xyy");
	list.add("xyy");
	list.add("xuz");
	
//	for(int i=0; i<= list.size();i++) {
//		if("xuz".equals(list.get(i))) {
//			list.remove(i);
//		}
//	}
	
//	
//	Iterator<String> it = list.iterator();
//	while(it.hasNext()) {
//		if(it.next().equals("xuz")) {
//			list.remove(it);
//		}
//	}
//	
//	for(String i: list){
//		if(it.next().equals("xuz")) {
//			list.remove(it);
//		}
//	}
	
	sum(1,2,3,4,5,6);

	Staticfactory s = Staticfactory.setValues("ghjj",32, 5342312);
	Staticfactory s2 = Staticfactory.setValues("ghjj",32, 5342312);
	

	System.out.println(list.get(0).equals(1));

	}
	
}
