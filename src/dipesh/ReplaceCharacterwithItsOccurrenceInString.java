package dipesh;

import java.util.Arrays;

public class ReplaceCharacterwithItsOccurrenceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//youtube: https://www.youtube.com/watch?v=RMRkK3rF1OU     from: 1:17:00 to 1:54:00
		
		//input=OPENTEXT
		//replace character 'T' with it occurances
		//op=OPEN1EX2
		
		String str="opentext";
		char charToReplace='t';
		
		if(str.indexOf(charToReplace)==-1)
		{
			System.out.println("given character is not available in input string");
			System.exit(0);
		}
		
		//logic to replace
		int count=1;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch==charToReplace)
			{
				str= str.replaceFirst(String.valueOf(charToReplace),String.valueOf(count));
				count++;
			}
		}
		System.out.println(str);
		

	}

}
