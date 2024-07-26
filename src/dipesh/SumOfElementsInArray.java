package dipesh;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,2,7,9,6};
		
		int sum=0;
		
		/*for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		*/
		
		//enhanced for loop (for each loop)
		
		for(int value:a)
		{
			sum=sum+value;
		}
		System.out.println(sum);

	}

}
