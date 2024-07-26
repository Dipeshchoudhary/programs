package dipesh;
import java.util.HashMap;
public class RemoveRepeatedInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//youtube:https://www.youtube.com/watch?v=NRk_XPi6FwE
			int arr[]= {1,2,3,2,5,7,5};
			
			
			HashMap<Integer,Integer>hmap=new HashMap<>();
			
			for(int i=0;i<arr.length;i++)
			{
				if(hmap.containsKey(arr[i]))
				{
					hmap.put(arr[i],hmap.get(arr[i])+1);
				}
				else
				{
					hmap.put(arr[i], 1);
				}
			}
			
			hmap.forEach((k,v)->System.out.println(k+" "));
			
			
	}

}
