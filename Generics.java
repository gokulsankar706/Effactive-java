//$Id$
package Cooks;

import java.util.ArrayList;
import java.util.Iterator;

public class Generics<N> {
	
	ArrayList<N> nums = new ArrayList<N>();
	
	public void add(N n) {
		nums.add(n);
	}
	
	public void addAll(ArrayList<N> nums) {
		Iterator<N> it = nums.iterator();
		while(it.hasNext()) {
			nums.add(it.next());
		}
	}
	public void print(ArrayList<N> nums ) {
		Iterator<N> it = nums.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public void print() {
		Iterator<N> it = nums.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
