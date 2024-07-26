package dipesh;

import java.util.Scanner;

public class decimalToBinaryWithUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int num=sc.nextInt();
		
		String op=" ";
		int temp=num;
		
		while(temp>0)
		{
			int rem=temp%2;
			temp=temp/2;
			op=rem+op;
		}
		System.out.println("binary no will be:"+op);
	}

}
