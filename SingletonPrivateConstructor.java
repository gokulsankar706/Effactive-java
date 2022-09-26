//$Id$
package Cooks;

public class SingletonPrivateConstructor {
		private static final SingletonPrivateConstructor Obj = new SingletonPrivateConstructor();
	    
		private int number;
	    private String string;
	  
	    private SingletonPrivateConstructor(){}
	    
	    public void setNumber(int num){
	        this.number = num;
	    }
	    public void setString(String str){
	        this.string = str;
	    }
	    
	    public String getString(){
	        return this.string;
	    }
	    public int getNumber(){
	        return this.number;
	    }
	    
	    public static SingletonPrivateConstructor getInstance(){
	         return Obj;
	    }
	    
	    @Override
	    public String toString() {
	    	return ("name :"+number+"\nstring :"+string);
	    }
}
