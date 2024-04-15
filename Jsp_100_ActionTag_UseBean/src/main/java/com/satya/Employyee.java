package com.satya;

public class Employyee {
	private int empId;
	private int sal;
	private String Addrss;
	
	public int getEmpId() {
		return empId;
	}
	public Employyee() {
		super();
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getAddrss() {
		return Addrss;
	}
	public void setAddrss(String addrss) {
		Addrss = addrss;
	}
	@Override
	public String toString() {
		return "Employyee [empId=" + empId + ", sal=" + sal + ", Addrss=" + Addrss + "]";
	}

}
