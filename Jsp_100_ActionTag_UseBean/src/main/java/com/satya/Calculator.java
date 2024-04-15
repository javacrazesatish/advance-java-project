package com.satya;

public class Calculator {
	private int n;
	
	@Override
	public String toString() {
		return "Calculator [n=" + n + "]";
	}

	public Calculator(int n) {
		super();
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int cube(int n) {
		return n*n*n;
	}

}
