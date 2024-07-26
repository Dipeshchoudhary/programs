package dipesh;

public class Primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//youtube-https://www.youtube.com/watch?v=-edAgWN1mQk
		
				int no=7;
				int count =0;	
				
				for(int i=1;i<=no;i++)
				{
					if(no%i==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					System.out.println("its prime");
				}
				else
				{
					System.out.println("not prime");
				}
	}

}
