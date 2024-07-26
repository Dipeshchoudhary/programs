package dipesh;

import java.util.Arrays;

public class CompareTwoArraysEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {1,2,3,5,4};
		
		if(arr1.length!=arr2.length)
		{
			System.out.println("not equal");
			System.exit(0);
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=arr2[i])
			{
				System.out.println("not equal");
				System.exit(0);
			}
		}
		System.out.println("equal");
		
	}

}
