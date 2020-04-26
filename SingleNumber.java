package java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleNumber {
	
	 public static int singleNumber(int[] nums) {
		 int num = nums[0];
	        for (int i = 1; i < nums.length; i++) num ^= nums[i];
	        return num;
	    }

	public static void main(String[] args) {
		int[] s =new int[] {2,2,1};
		System.out.println(singleNumber(s));
	}

}
