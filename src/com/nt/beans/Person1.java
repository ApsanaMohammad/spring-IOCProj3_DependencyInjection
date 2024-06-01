package com.nt.beans;

public class Person1 {
	private int pid;
    private String pname;
    private String padd;
    private float income;
    
    
    
  public Person1(int pid, String pname, String padd, float income) {
	  System.out.println("Person1.....constructor injection");
		this.pid = pid;
		this.pname = pname;
		this.padd = padd;
		this.income = income;
	}



	//generate tostring method al+shift+s and 
  	@Override
  	public String toString() {
  		return "Person [pid=" + pid + ", pname=" + pname + ", padd=" + padd + ", income=" + income + "]";
  	}
}
