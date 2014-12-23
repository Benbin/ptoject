package com.practice;

public class OperationDiv extends Operation {
	public double GetResult()
	{
		double result;
		if(this.number_B==0)
		{
			System.out.println("被除数不能为零");
		}
		result=this.number_A/this.number_B;
		return result;
	}
}