package dipesh;

public class searchingAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,40,50,30};
		
		int ser_ele=50;
		boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(ser_ele==a[i])
			{
				System.out.println("element found at:"+i);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("element not found");
		}
	}

}
