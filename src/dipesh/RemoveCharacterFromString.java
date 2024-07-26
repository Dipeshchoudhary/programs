	package dipesh;
import java.util.Scanner;
public class RemoveCharacterFromString {
	
	public static String removeChar(String str,char ch)
	//https://www.youtube.com/watch?v=3RhJ2qTnOJ8
	{
	int n=str.length();
	String ans="";
	
	for(int i=0;i<n;i++)
	{
		if(str.charAt(i)!=ch)
		{
			ans+=str.charAt(i);
		}
	}
	return ans;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char ch=sc.next().charAt(0);
		System.out.println(removeChar(str,ch));
		
	}

}
