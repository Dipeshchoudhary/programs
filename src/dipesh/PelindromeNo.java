	package dipesh;

public class PelindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=125;
		int temp=no;
		int rem,rev=0;
		
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println("no is pelindrome");
		}
		else
		{
			System.out.println("no is not pelindrome");
		}

	}

}
