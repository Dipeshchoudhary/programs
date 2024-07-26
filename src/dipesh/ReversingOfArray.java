package dipesh;

public class ReversingOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2,4,6,8,10,12,14};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
			
		}
		reverse(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

	public static void reverse(int[] arr)
	{
		int i=0,j=arr.length-1;
		
		while(i<j)
		{
			int t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
			
			i++;
			j--;
		}
	}
}
