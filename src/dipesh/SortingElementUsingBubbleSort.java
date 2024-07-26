package dipesh;

import java.util.Arrays;

public class SortingElementUsingBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//youtube:https://www.youtube.com/watch?v=cJ2eMUiCFy4&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=22
		
		int a[]= {4,2,1,5,3};
		
		System.out.println("array before sorting:"+Arrays.toString(a));
		int n=a.length;
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("arrays after sorting"+Arrays.toString(a));
	}

}
