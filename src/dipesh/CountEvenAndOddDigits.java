package dipesh;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//youtube:https://www.youtube.com/watch?v=Ns4LoG56SZ4&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=7
		
		int num=123456;
		
		int even=0,odd=0;
		
		while(num>0)
		{
			int rem=num%10;
			
			if(rem%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			
			num=num/10;
		}
		System.out.println(even);
		System.out.println(odd);
		
	}

}
