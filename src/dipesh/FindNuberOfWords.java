package dipesh;

public class FindNuberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="learn with kirshna sandeep.";
		FindNuberOfWords fb=new FindNuberOfWords();
		fb.getWordsVowelCount(str);
	}
	
	void getWordsVowelCount(String str)
	{
		int wordCount=0;
		int vowelCount=0;
		int upperCount=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			switch(ch)
			{
			case ' ':
			case '.':
				wordCount++;
			}
			
			switch(ch)
			{
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				
				vowelCount++;
			
			}
			
			if(ch>=65 && ch<=90)
			{
				upperCount++;
			}
		}
	
		System.out.println(wordCount);
		
	}

}
