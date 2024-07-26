package dipesh;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindingDuplicateUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//youtube:https://www.youtube.com/watch?v=hrgCe0nVytw
		
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,2,3,4,5);
		
		Set<Integer>dup=list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toSet());
		System.out.println(dup);
	}

}
