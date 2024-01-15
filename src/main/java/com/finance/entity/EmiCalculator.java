package com.finance.entity;


public class EmiCalculator {
	private double loanAmount;
	private double interestRate;
	private int loanTerm;
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public int getLoanTerm() {
		return loanTerm;
	}
	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}
	@Override
	public String toString() {
		return "EmiCalculator [loanAmount=" + loanAmount + ", interestRate=" + interestRate + ", loanTerm=" + loanTerm
				+ "]";
	}
	
	
}
