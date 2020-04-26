package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public static List<List<String>> groupAnagrams(String[] strs) {
		if(strs.length==0) {return new ArrayList<>();}
		Map<String,List<String>> map = new HashMap<>();
		for(String s:strs) {
			char[] c = s.toCharArray();
			Arrays.sort(c);
			String sorted =String.valueOf(c);
			if(!map.containsKey(sorted)) {map.put(sorted, new ArrayList<String>());}
			map.get(sorted).add(s);
		}
       return new ArrayList<>(map.values());
    }

	public static void main(String[] args) {
		
		String[] s =new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(groupAnagrams(s));

	}


}
