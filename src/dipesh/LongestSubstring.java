package dipesh;

import java.util.HashSet;
import java.util.Set;

//youtube: https://www.youtube.com/watch?v=jHj13UHURr8&t=713s
//not resolved

public class LongestSubstring {
	
	public int longestSubstring1(String s)
	{
		int left=0, right=0;
		
		Set<Character>seen=new HashSet<>();
		int max=0;
		
		while(right<s.length())
		{
			char c=s.charAt(right);
			if(seen.add(c))
			{
				max=Math.max(max,right-left+1);
				right++;
			}
			else
			{
				while(s.charAt(left)!=c)
				{
					seen.remove(s.charAt(left));
				}
				seen.remove(c);
				left++;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcabcbb";
		
		LongestSubstring lb=new LongestSubstring();
		lb.longestSubstring1(s);
		
	}

}
