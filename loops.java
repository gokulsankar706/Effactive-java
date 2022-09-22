//$Id$
package Cooks;

import java.util.ArrayList;
import java.util.Iterator;

public class loops {
	public static void main(String arg[]) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("xyz");
	list.add("xyr");
	list.add("xyt");
	list.add("xyy");
	list.add("xyu");
	list.add("xuz");
	
	for(int i=0; i<= list.size();i++) {
		if("xuz".equals(list.get(i))) {
			list.remove(i);
		}
	}
	
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
	
	
	System.out.println(list);
	
	}
}
