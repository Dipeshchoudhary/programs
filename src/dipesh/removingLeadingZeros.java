package dipesh;

public class removingLeadingZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="000012345";
		String ans="";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='0')
			{
				continue;
			}
			else
			{
				ans=str.substring(i);
				break;
			}
		}
		System.out.println(ans);
		
		

	}

}
