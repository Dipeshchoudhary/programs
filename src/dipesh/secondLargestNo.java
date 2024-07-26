package dipesh;

public class secondLargestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//youtube: https://www.youtube.com/watch?v=R57n33zxgIw
		
		int temp;
		int []a= {6,8,2,4,3,1,5,7};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("second largest no:"+a[1]);

	}

}
