package dipesh;

import java.util.HashMap;

public class NonRepetingCharactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//youtube-https://www.youtube.com/watch?v=dooYlGcJrPc&t=2s
		
		String str="aagcdefccb";
		HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
		
		int lengthOfString=str.length();
		
		for(int i=0;i<lengthOfString;i++)
		{
			Character currchar=str.charAt(i);
			
			if(hmap.containsKey(currchar)==false)
			{
				hmap.put(currchar, 1);
				
			}
			else
			{
				int currentFreq=hmap.get(currchar);
				currentFreq++;
				hmap.put(currchar, currentFreq);
			}
					}
		
		boolean NonrepetingChar=false;
		
		for(int i=0;i<lengthOfString;i++)
		{
			Character currchar=str.charAt(i);
			int currentFreq=hmap.get(currchar);
			
			if(currentFreq==2)
			{
				System.out.println(currchar);
				NonrepetingChar=true;
				break;
			}
		}
		if(NonrepetingChar==false)
		{
			System.out.println(-1);
		}

	}

}
