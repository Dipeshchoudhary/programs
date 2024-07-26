package dipesh;

import java.util.Stack;

public class StringIsWellFormedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//video - https://www.youtube.com/watch?v=jC_y-XbOXvg&list=PLF9tovyahfL2pF-DWH7WQyuN_Cmz64DTT&index=2

			String str="{[]}";
		Stack<Character>st=new Stack<>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(st.empty())
			{
				st.push(ch);
			}
			else if(ch=='{' || ch=='['|| ch=='(')
			{
				st.push(ch);
			}
			else if(ch=='}' && st.peek()=='{')
			{
				st.pop();
			}
			else if(ch==']' && st.peek()=='[')
			{
				st.pop();
			}
			else if(ch==')' && st.peek()=='(')
			{
				st.pop();
			}
		}
		if(st.empty())
		{
			System.out.println("string is welformed");
		}
		else
		{
			System.out.println("string is not well formed");
		}
	}

}
