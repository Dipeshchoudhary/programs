package dipesh;

public class NoOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String str="Hey Everyone";
				str=str.toLowerCase();
			int count=0;
			
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				
				if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u')
				{
					count++;
				}
				 
			}
			System.out.println(count);
			
	}

}
