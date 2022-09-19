//$Id$
package Cooks;

import java.util.*;

public class ClassesAndInterfaces{
	
	
	ArrayList<Composition> simUserDetails = new ArrayList<Composition>();
	
	public void createUser(String name, int phNumber, String dOB, int aadharNum){
		simUserDetails.add(Composition.getSIM(name, phNumber, dOB, aadharNum));
	}
	
	public ArrayList<Composition> getUsers(){
		return simUserDetails;
	}
	
}
