package dipesh;

public class EvenLengthWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="hell world gfds kjhjk nmbv vell hdihg";
		for(String s: str.split(" "))
		{
			if(s.length()%2==0)
			{
				System.out.println(s);
			}
		}

	}

}
