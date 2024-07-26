package dipesh;

import java.util.Scanner;

public class pelindromeStringwithUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string:");
		
		String str=sc.nextLine();
		String org_str=str;
		
		String rev="";
		
		int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(org_str.equals(rev))
		{
			System.out.println("its pelindrome");
		}
		else
		{
			System.out.println("its not pelindrome");
		}

	}

}
