package dipesh;

public class SortStringHighesttToLowest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for loop
		
		String str="java is a programming language";
		String arr[]=str.split(" ");
		
		String temp;
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].length()>arr[j].length())
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			//System.out.println(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
	}

}
