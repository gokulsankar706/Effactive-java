//$Id$
package Cooks;

public class SingletonPrivateConstructor {
	    private int number;
	    private String string;
	    
	    private static final SingletonPrivateConstructor Obj = new SingletonPrivateConstructor();
	    
	    private SingletonPrivateConstructor(){
	        
	    }
	    public static SingletonPrivateConstructor getInstance(){
	         return Obj;
	    }
	    
	    
	    @Override
	    public String toString() {
	    	return ("name :"+number+"\nstring :"+string);
	    }
}
