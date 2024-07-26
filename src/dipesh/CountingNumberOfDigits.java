package dipesh;

public class CountingNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=123456;
		int count=0;
		
		while(no>0)
		{
			no=no/10;
			count++;
		}
		System.out.println("digits are:"+count);
	}

}
