package dipesh;

public class Capitalize1stLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//youtube: https://www.youtube.com/watch?v=xz8j1esbOAQ
		
		String str="i am going to school";
		String reqStr="";
		
		String arr[]= str.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			char c=arr[i].charAt(0);
			String c1=String.valueOf(c).toUpperCase();
			String sub=arr[i].substring(1);
			reqStr=reqStr+c1+sub+" ";
			
		}
		System.out.print(reqStr.trim());
		
	
	}

}
