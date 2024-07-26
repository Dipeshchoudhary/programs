package dipesh;

public class MakeAlternateWordUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://www.youtube.com/watch?v=uh08xHqQ48Y
		
		//concat string me change hai ask to dhramik
		
		String str="i am going to school";
		String s1="";
		String s2="";
		boolean even=false;
		
		for(int i=0;i<str.length();i+=2)
		{
			//System.out.println(str.charAt(i).toUpperCase());
			char ch=str.charAt(i);
			s1=String.valueOf(ch).toUpperCase();
			even=true;
			System.out.print(s1);
		}
		for(int i=1;i<str.length();i+=2)
	     {
	         char ch=str.charAt(i);
	         s2=String.valueOf(ch).toLowerCase();
	         even=false;
	         System.out.print(s2);
	     }
	     
		
	     String s3=s1.concat(s2);
	     System.out.print(s3);
	}

}
