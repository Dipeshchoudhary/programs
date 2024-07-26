
package dipesh;

import java.util.Scanner;

public class FindMaxDiffInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//youtube:https://www.youtube.com/watch?v=bUioAeu7rrI
		
		int n,max,min;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements for array");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the element in array");
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();       //storing the elements in rray
		}
		
		max=a[0];
		min=a[0];
		
		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];  //finding max
			}
		}
		
		for(int i=0;i<n;i++)
		{
			if(a[i]<min)
			{
				a[i]=min;       //finding min
			}
		}
		
		System.err.println("maximum="+max);
		System.err.println("minimum="+min);
		System.err.println("maximum diference="+(max-min));

	}

}
