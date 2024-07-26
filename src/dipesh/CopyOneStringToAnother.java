package dipesh;

public class CopyOneStringToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="ABC tech";
		char arr[]=str.toCharArray();
		int size=arr.length;
		char a[]=new char[size];
		int i=0;
		
		while(i!=size)
		{
			a[i]=arr[i];
			++i;
		}
		System.out.println(arr);
		System.out.println(a);

	}

}
