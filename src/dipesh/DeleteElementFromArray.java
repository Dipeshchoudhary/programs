package dipesh;

import java.util.Arrays;

public class DeleteElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//youtube:https://www.youtube.com/watch?v=mZm93Bmb3dg&list=PLF9tovyahfL020hGgLIsRMZY4bfSLCFUa&index=2
		

			int originalArray[]= {1,2,3,4,5};
			int elementToBeRemoved=3;
			int newarray[]=remove(originalArray,elementToBeRemoved);
			
			System.out.println("original array"+Arrays.toString(originalArray));
			System.out.println("new array"+Arrays.toString(newarray));
			
	}
	
	public static int[] remove(int[] array,int element)
	{
		int newarray[]=new int[array.length-1];
		int index=0;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=element)
			{
				newarray[index]=array[i];
				index++;
			}
		}
		return newarray;
		
	}

}
