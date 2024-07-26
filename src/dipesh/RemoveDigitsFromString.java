package dipesh;

public class RemoveDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//youtube-https://www.youtube.com/watch?v=qRA716XJyQI
		
		//solution-1
		
		String str="india0001234";
		System.out.println(remove(str));	
		
	}
	public static String remove(String str)
	{
		String result="";
		
		for(int i=0;i<str.length();i++)
		{
			if(!Character.isDigit(str.charAt(i)))
			{
				result=result+str.charAt(i);
			}
		}
		return result;
	}

}
