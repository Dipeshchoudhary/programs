package dipesh;

public class Replace_0_with_5_inNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//youtube-https://www.youtube.com/watch?v=bGXRQncJvz0
		int n=1004;
		int newnumber=0;
		
		while(n!=0)
		{
			int rem=n%10;
			n=n/10;
			if(rem!=0)
			{
				newnumber=newnumber*10+rem;
			}
			else
			{
				newnumber=newnumber*10+5;
			}
		}
		
		int rev=0;
		
		while(newnumber!=0)
		{
			int rem=newnumber%10;
			newnumber=newnumber/10;
			rev=rev*10+rem;
		}
		System.out.println(rev);
	}

}
