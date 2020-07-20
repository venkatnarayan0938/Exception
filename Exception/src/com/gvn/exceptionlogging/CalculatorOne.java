package com.gvn.exceptionlogging;

public class CalculatorOne {
	
		double principle,time,rateofInterest;
		CalculatorOne(double principle,double time,double rateofInterest)
		{
			this.principle=principle;
			this.time=time;
			this.rateofInterest=rateofInterest;
		}
		public double calculateCompoundInterest()
		{
			return principle*(Math.pow((1+(rateofInterest/100)),time));
		}
	
}
