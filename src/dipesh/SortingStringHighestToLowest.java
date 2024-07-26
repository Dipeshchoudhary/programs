package dipesh;

public class SortingStringHighestToLowest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="java is a programming language";
		
		String arr[]=str.split(" ");
		int min;
		String temp;
		
		for(int i=0;i<arr.length;i++)
		{
			min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j].compareTo(arr[min])<0)
				{
					min=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}
