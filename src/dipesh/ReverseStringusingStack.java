package dipesh;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringusingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		
		String str=sc.nextLine();
		
		Stack<Character>st=new Stack<>();
		
		for(int i=0;i<str.length();i++)
		{
			st.push(str.charAt(i));
		}
		
		System.out.println("reverser the string");
		
		while(!st.empty())
		{
			System.out.print(st.pop());
		}
	}

}
