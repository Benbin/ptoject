package com.practice;

public class OperatonFactory {
	
	public static Operation CreateOperate(String operate)
	{
		Operation oper=null;
		switch(operate)
		{
		case "+":
			oper=new OperationAdd();
			break;
		case "-":
			oper=new OperationSub();
			break;
		case "*":
			oper=new OperationMul();
			break;
		case "/":
			oper=new OperationDiv();
			break;
		}
		return oper;
	}

}
