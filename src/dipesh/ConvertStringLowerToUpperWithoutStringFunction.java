package dipesh;

import java.util.Scanner;

public class ConvertStringLowerToUpperWithoutStringFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string: ");
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>='a'&& arr[i]<='z')
			{
				arr[i]=(char)(arr[i]-32);           //typecasting
			}
		}
		str=new String(arr);  //by using constructor converting into string
		System.out.println(str);
	}

}
