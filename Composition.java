//$Id$
package Cooks;

public class Composition extends Object{
	
	//mandatory informations
	private String name;
	private int phNumber;
	private String DOB;
	private int aadharNum;
	
	public Composition() {}
	public Composition(String name, int phNumber, String dOB, int aadharNum) {
		super();
		this.name = name;
		this.phNumber = phNumber;
		this.DOB = dOB;
		this.aadharNum = aadharNum;
	}
	
	public static Composition getSIM(String name, int phNumber, String dOB, int aadharNum) {
		return new Composition(name,phNumber,dOB,aadharNum);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhNumber() {
		return phNumber;
	}
	public void setPhNumber(int phNumber) {
		this.phNumber = phNumber;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public int getAadharNum() {
		return aadharNum;
	}
	public void setAadharNum(int aadharNum) {
		this.aadharNum = aadharNum;
	}
	
	@Override
	public String toString() {
		return ("Name :"+name+"\nPhone :"+phNumber+"\nDoB :"+DOB+"\naadharNum :"+aadharNum);
	}
	
	
}
