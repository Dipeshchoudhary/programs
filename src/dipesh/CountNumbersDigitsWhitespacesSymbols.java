package dipesh;

public class CountNumbersDigitsWhitespacesSymbols {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="!! Test Automation contral !! @ 12345";
		
		int digits=0,letters=0,whitespaces=0,special=0;
		
		for(char ch:str.toCharArray())
		{
			if(Character.isLetter(ch))
			{
				letters++;
			}
			else if(Character.isWhitespace(ch))
			{
				whitespaces++;
			}
			else if(Character.isDigit(ch))
			{
				digits++;
			}
			else
			{
				special++;
			}
			
		}
		System.out.println("digits are: "+digits);
		System.out.println("letters are: "+letters);
		System.out.println("whitespaces are: "+whitespaces);
		System.out.println("special are: "+special);

	}

}
