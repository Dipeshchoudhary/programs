package dipesh;

public class MissingNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//youtube: https://www.youtube.com/watch?v=Uywn0YzX8OQ&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=17
		
		//array should not have duplicates
		//array no need to be in sorted order
		//array should be in range

		
		int a[]= {1,2,4,5};
		
		int sum1=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println(sum1);
		int sum2=0;
		
		for(int i=1;i<=5;i++)
		{
			sum2=sum2+i;
		}
		System.out.println(sum2);
		
		System.out.println("missing no="+(sum2-sum1));
	}

}
