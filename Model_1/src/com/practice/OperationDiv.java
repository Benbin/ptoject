package com.practice;

public class OperationDiv extends Operation {
	public double GetResult()
	{
		double result;
		if(this.number_B==0)
		{
			System.out.println("����������Ϊ��");
		}
		result=this.number_A/this.number_B;
		return result;
	}
}