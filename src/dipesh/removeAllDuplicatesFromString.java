package dipesh;

public class removeAllDuplicatesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//youtube:https://www.youtube.com/watch?v=W6rCN8Zcikc - approach3
		
		String str="programming";
		
		char arr[]=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<arr.length;i++)
		{
			boolean repeated=false;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					repeated=true;
					break;
				}
			}
			
			if(!repeated)
			{
				sb.append(arr[i]);
			}
		}
		
		System.out.println(sb);

	}

}
