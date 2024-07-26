package dipesh;

public class panagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//channel: learn with krishnaSandeep
		//panagram means which contains all the letters from A to Z or not
		
		String str="the quick brown fox jumps over the lazy dog";
		System.out.println(ispanagram(str));

	}

	private static boolean ispanagram(String str) {
		// TODO Auto-generated method stub
		
		if(str.length()<26)
		{
			return false;
		}
		else
		{
			for(char ch='a';ch<='z';ch++)
			{
				if(str.indexOf(ch)<0)
				{
					return false;
				}
				
			}
		}
			return true;
		
	}

}
