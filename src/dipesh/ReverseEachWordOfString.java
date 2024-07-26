package dipesh;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="java programming";
		String arr[]=str.split(" ");
		String revString=" ";
		
		for(int i=0;i<arr.length;i++)
		{
			String word=arr[i];
			String revword="";
			
			for(int j=word.length()-1;j>=0;j--)
			{
				revword=revword+word.charAt(j);
			}
			
			revString=revString+revword+" ";
		}
		System.out.println(revString.trim());

	}

}
