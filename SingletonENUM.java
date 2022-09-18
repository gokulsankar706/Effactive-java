//$Id$
package Cooks;

public enum SingletonENUM {
	INSTANCE;
    
    private int number;
    private String string;
    
    public void setNumber(int num){
        this.number = num;
    }
    
    public void setString(String str){
        this.string = str;
    }
    
    @Override
    public String toString() {
    	return ("name :"+number+"\nstring :"+string);
    }
}
