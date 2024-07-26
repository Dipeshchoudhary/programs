package dipesh;

public class SumOfDigitsInnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//youtube:https://www.youtube.com/watch?v=ZLaBlxnmrxc&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=8
		
		int num=1234;
		int sum=0;
		
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		
		System.out.println(sum);

	}

}
