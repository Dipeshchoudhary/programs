package dipesh;

public class PrintEvenAndOddNumbersFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6};
		
		
		/*System.out.println("even no");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
		System.out.println("odd no");
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}*/
		
		
		//for each loop
		System.out.println("even no");
		for(int value:a)
		{
			if(value%2==0)
			{
				System.out.println(value);
			}
		}
		
		System.out.println("odd no");
		for(int value:a)
		{
			if(value%2!=0)
			{
				System.out.println(value);
			}
		}

	}

}
