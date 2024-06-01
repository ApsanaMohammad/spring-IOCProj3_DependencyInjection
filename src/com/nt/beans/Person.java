package com.nt.beans;

public class Person {
	//spring bean properties
    private int pid;
    private String pname;
    private String padd;
    private float income;
    

    //setters for setter injection alt+shift+s and r
    
	public void setPid(int pid) {
		System.out.println("Person.....setter injection injection");
		this.pid = pid;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setPadd(String padd) {
		this.padd = padd;
	}
	public void setIncome(float income) {
		this.income = income;
	}
    
    //generate tostring method al+shift+s and 
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", padd=" + padd + ", income=" + income + "]";
	}
    
    
}
