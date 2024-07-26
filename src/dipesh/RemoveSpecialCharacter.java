package dipesh;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="!@#$%*&%$ latin string 096543";
		String str=s.replaceAll("[^a-zA-z0-9]", "");
		System.out.println(str);
		
	}

}
