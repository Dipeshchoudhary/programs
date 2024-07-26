package dipesh;

public class GivenSubstringIspresent {
	//https://www.youtube.com/watch?v=GyU5I1UxO2o
	
	public static boolean issubstring(String main,String sub)
	{
		return main.matches("(.*)"+ sub +"(.*)");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println(issubstring("naveen automation labs","labs"));
			System.out.println(issubstring("naveen automation labs","naveen"));
			System.out.println(issubstring("naveen automation labs 1234","testing"));
			System.out.println(issubstring("naveen automation labs 1234","1234"));
			System.out.println(issubstring("naveen automation labs 1234","auto"));
			
			
	}

}
