package dipesh;
import java.util.HashSet;
import java.util.Set;

public class RemoveRepeatedIntegerUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,2,5,7,5};
		Set<Integer>st=new HashSet<>();
		
		for(int i=0;i<arr.length;i++)
		{
			st.add(arr[i]);
		}
		st.forEach(elem->System.out.println(elem+" "));
	}

}
