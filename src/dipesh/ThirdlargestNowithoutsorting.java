package dipesh;

public class ThirdlargestNowithoutsorting {

	public static void main(String[] args) {
		int a[]= {2,3,6,4,7,5,8,9};
		int temp;
		
		for(int i=0;i<a.length;i++) {
			
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
		System.out.println("third largest no:"+a[2]);
	}

}
