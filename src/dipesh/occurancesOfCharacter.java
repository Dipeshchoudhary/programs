package dipesh;

import java.util.HashMap;
public class occurancesOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String str="hello dipesh";
		char arr[]=str.toCharArray();
			HashMap<Character,Integer>hmap=new HashMap<Character,Integer>();
			
			for(int i=0;i<arr.length;i++)
			{
				Character currChar=arr[i];
				
				if(!hmap.containsKey(currChar))
				{
					hmap.put(currChar, 1);
				}
				else
				{
					int currFreq=hmap.get(currChar);
					currFreq++;
					hmap.put(currChar, currFreq);
				}
			}
			System.out.println(hmap);

			}

}
