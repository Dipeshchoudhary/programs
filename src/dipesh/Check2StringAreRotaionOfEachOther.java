package dipesh;

public class Check2StringAreRotaionOfEachOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//youtube:https://www.youtube.com/watch?v=_rLGN8GhDSE&list=PLF9tovyahfL2pF-DWH7WQyuN_Cmz64DTT&index=18

		/* 3 conditons for this
		1.same length
		2. contains the same character
		3. rotated around the character */
		
		System.out.println(isrotated("abcd","dacb"));
		
	}
	
	public static boolean isrotated(String str,String rotated_String)
	{
		if(str==null || rotated_String==null)
		{
			return false;
		}
		else if(str.length()!=rotated_String.length())
		{
			return false;
		}
		else
		{
			String concatenated=str+str;
			return concatenated.contains(rotated_String);
		}
	}

}
