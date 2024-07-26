package dipesh;
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//input=6 - divisor- 1,2,3 (1+2+3=6)op=perfect
		//ip- 10 divisor- 1,2,5 (1+2+5=8)op=not perfect
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
			sum=sum+i;
		}
		
		
		if(sum==no)
		{
			System.out.println("perfect no");
		}
		else
		{
			System.out.println("its not perfect");
		}

	}

}
