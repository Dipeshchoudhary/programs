package dipesh;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RemoveWordsFromSentences {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//youtube-: https://www.youtube.com/watch?v=LWc-ukBWThc
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String str=sc.nextLine();
		System.out.println("enter the word to delete");
		String word=sc.nextLine();
		System.out.println("position of the word to be delete");
		int pos=Integer.parseInt(sc.nextLine()); //converting string to int
		
		int l=str.length();
		char ch=str.charAt(l-1);  //to find the last char of the sentence
		
		if(ch=='.' || ch=='?'|| ch=='!')
		{
			StringTokenizer st=new StringTokenizer(str," .?!");
			String f="";
			int n=st.countTokens(); //it will give how many no of words extracted
			
			for(int i=1;i<=	n;i++)
			{
				String t=st.nextToken();  //will give u a word from sentence one by one
				
				if(i==pos && t.equals(word))
				{
					continue;
				}
				else
				{
					f=f+t+" ";
				}
			}
			f=f.trim()+ch; //to append last char such as .?!
			System.out.println("final string:\n"+f);
			
		}
		else
		{
			System.out.println("the sentnece is not valid");
		}
		
		
		
		
		
		
		
	}

}
