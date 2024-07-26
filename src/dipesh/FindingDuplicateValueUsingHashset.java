package dipesh;

import java.util.HashSet;

public class FindingDuplicateValueUsingHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//youtube: https://www.youtube.com/watch?v=X_NfqtyG4Bs&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=19
		
		String arr[]= {"java","c","c++","python","java"};
		
		HashSet<String>hset=new HashSet<>();
		
		boolean flag=false;
		
		for(String l:arr)
		{
			if(hset.add(l)==false)
			{
				System.out.println("found duplicate elements: "+l);
				flag=true;
			}
		}
		
		if(flag==false)
		{
			System.out.println("duplicate elements not found");
		}
		

	}

}
