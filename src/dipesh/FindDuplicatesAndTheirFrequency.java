package dipesh;

import java.util.HashMap;

public class FindDuplicatesAndTheirFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//youtube:https://www.youtube.com/watch?v=YdIcoNJY7wo
		
		String str="java programming";
		char arr[]=str.toCharArray();
		
		HashMap<Character,Integer>hmap=new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			Character currChar=arr[i];
			
			if(Character.isAlphabetic(arr[i]))      //to remove ( )space from frequency
			{
			if(hmap.containsKey(currChar))
			{
				hmap.put(currChar, hmap.get(arr[i])+1);
			}
			else
			{
				hmap.put(currChar, 1);
			}
		}
		}
		hmap.entrySet().removeIf(e->e.getValue()==1);
		System.out.println(hmap);
	}

}
