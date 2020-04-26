package java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sort{
	
	
	static int find_sub(String s, int k)  
    { 
        int len = s.length(); 
  
        // initialize left and right pointer to 0  
        int lp = 0, rp = 0; 
        int ans = 0; 
  
        // an array to keep track of count of each alphabet  
        int[] hash_char = new int[26]; 
        for (; rp < len; rp++)  
        { 
            hash_char[s.charAt(rp) - 'a']++; 
            while (hash_char[s.charAt(rp) - 'a'] > k)  
            { 
                // decrement the count  
                hash_char[s.charAt(lp) - 'a']--; 
  
                //increment left pointer  
                lp++; 
            } 
            ans += rp - lp + 1; 
        } 
        return ans; 
    } 


	public static void main(String[] args) {
  
		String S = "cycle"; 
        int k = 1; 
        System.out.println(find_sub(S, k)); 
	}
}
