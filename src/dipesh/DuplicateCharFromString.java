package dipesh;

public class DuplicateCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=new String("banglore");
		int count=0;
		char arr[]=str.toCharArray();
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println("duplicate char is"+arr[j]);
					flag=true;
					count++;
				}
			}
		}
		System.out.println(count);
		
		if(flag==false)
		{
			System.out.println("no duplicate element found");
		}
	}

}
