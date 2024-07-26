package dipesh;

public class decimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//youtube: https://www.youtube.com/watch?v=QKZUJDfPRmI - logic part
		
		int no=9;
		String op=" ";
		int temp=no;
		
		while(temp>0)
		{
			int rem=temp%2;
			temp=temp/2;
			op=rem+op;
		}
		System.out.println(op);

	}

}
