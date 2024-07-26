package dipesh;

public class PelindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="pap";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}

		if(str.equals(rev))
		{
			System.out.println("its pelindrome ");
		}
		else
		{
			System.out.println("not pelindrome");
		}
	}

}
