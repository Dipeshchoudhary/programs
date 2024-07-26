package dipesh;

//youtube: https://www.youtube.com/watch?v=8W1DQUyoZzk
public class FabonacciUsingRecusion {

	static int a=0,b=1,c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a+" "+b);
		FabonacciUsingRecusion fb=new FabonacciUsingRecusion();
		fb.printfib(10);
	}
	
	void printfib(int i)
	{
		if(i>=1)
		{
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
			printfib(i-1);
		}
	}
}
