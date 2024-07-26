package dipesh;

public class LongestPdlindrome {
	
	public static void main(String args[]) {
	
		String str="the quick brown fox jumps over the lazy dog";
		System.out.println(ispanagram(str));
		
	}

		private static boolean ispanagram(String str)
		{
			if(str.length()>26)
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