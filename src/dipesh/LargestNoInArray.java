package dipesh;

public class LargestNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,5,3,6,8,3};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
