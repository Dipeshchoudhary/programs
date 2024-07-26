
package dipesh;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rem,rev=0;
		int no=54321;
		
		while(no!=0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
			
		}
		System.out.println(rev);
		

	}

}
