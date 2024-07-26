package dipesh;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no ");
		int num=sc.nextInt();
		int cube=0;
		int t=num;
		
		while(num>0)
		{
			int r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
			
		}
		if(t==cube)
		{
			System.out.println("its armstrong");
		}
		else
		{
			System.out.println("its not armstrong");
		}
		

	}

}
