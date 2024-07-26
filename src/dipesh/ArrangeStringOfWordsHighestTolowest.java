package dipesh;

import java.util.Scanner;

public class ArrangeStringOfWordsHighestTolowest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//videosource - amplifylearning with alok
		
		
		//not yet completed
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		str=str+" ";  //to add the space at the last word
		int start=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch==' ')
			{
				String word=str.substring(start,i);
				System.out.println(word+ " "+ word.length());
				start=i+1;
			}
			
		}
		
		
		
	}

}
