package dipesh;

public class studypoit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//youtube-https://www.youtube.com/watch?v=Aw30p65TvO0&t=69s

		String s="Boy Is Good";
		
		String output="";
		
		String words[]=s.split(" ");
		
		for(int i=0;i<words.length;i++)
		{
			output=output+words[i].charAt(0);
			
		}
		System.out.println(output);
	}

}
