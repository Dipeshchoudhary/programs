package dipesh;

public class ReverseWordsOfSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//youtube: https://www.youtube.com/watch?v=VuSE76yJ2n4
		
		String str="welcome to cloudtech";
		String arr[]=str.split(" ");
		String rev="";
		
		for(int i=arr.length-1;i>=0;i--)
		{
			if(i==0)
			{
				rev=rev+arr[i];
			}
			else
			{
				rev=rev+arr[i]+" ";
			}
		}
		System.out.println(rev);
	}

}
