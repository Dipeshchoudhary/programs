package dipesh;
import java.util.List;
import java.util.Arrays;
import java.util.Optional;

public class SumOfAllNumverUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Optional<Integer>number=list.stream().reduce((a,b)->a+b);
		
		System.out.println(number);
	}

}
