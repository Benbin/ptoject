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
		//��ȡ�ӿ���̨��������ֺ������
		try
		{
		InputStreamReader ip=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ip);
		
		System.out.println("������һ������");
		String number1=br.readLine();
		
		System.out.println("�����������");
		String operate=br.readLine();
		
		System.out.println("������һ����");
		String number2=br.readLine();
		
		//��ȡ��������������
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
