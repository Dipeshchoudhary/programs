package dipesh;

public class PrimeNoBet1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i;
		
		for(i=1;i<=100;i++)
		{
			int temp=0;
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					temp=temp+1;
				}
			}
			
			if(temp==0)
			{
				System.out.println(i);
			}
			
			
		}

	}

}
