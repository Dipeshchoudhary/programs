package dipesh;

import java.util.HashMap;
public class stringFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="JAVA IS PROGRAMMING LANGUAGE AND JAVA IS";
	    
	    String arr[]=str.split(" ");
	    HashMap<String,Integer>hmap=new HashMap<String,Integer>();
	    
	    for(int i=0;i<arr.length;i++)
	    {
	        if(hmap.containsKey(arr[i]))
	        {
	            hmap.put(arr[i],hmap.get(arr[i])+1);
	        }
	        else
	        {
	            hmap.put(arr[i],1);
	        }
	    }
	    System.out.println(hmap);

	}

}
