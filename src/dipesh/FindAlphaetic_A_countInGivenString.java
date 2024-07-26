package dipesh;
import java.util.HashMap;

public class FindAlphaetic_A_countInGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="I AM A TEST USER";
		char arr[]=str.toCharArray();
		HashMap<Character,Integer>hmap=new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			Character currChar=arr[i];
			
			if(hmap.containsKey(currChar))
			{
				int currFreq=hmap.get(currChar);
				currFreq++;
				hmap.put(currChar, currFreq);
			}
			else
			{
				hmap.put(arr[i], 1);
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			Character currChar=arr[i];
			int currFreq=hmap.get(currChar);
			
			if(currChar=='A')
			{
				System.out.println(currFreq);
				break;
			}
		}

	}

}
