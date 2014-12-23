package com.practice;
import java.lang.*;
import java.io.*;

public class Calculator {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//获取从控制台输入的数字和运算符
		try
		{
		InputStreamReader ip=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ip);
		
		System.out.println("请输入一个数：");
		String number1=br.readLine();
		
		System.out.println("请输入运算符");
		String operate=br.readLine();
		
		System.out.println("请输入一个数");
		String number2=br.readLine();
		
		//获取两个数的运算结果
		Operation op;
		double result;
		OperatonFactory of=new OperatonFactory();
		op=of.CreateOperate(operate);
		op.number_A=Double.parseDouble(number1);
		op.number_B=Double.parseDouble(number2);
        result=op.GetResult();
        System.out.println(result);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
