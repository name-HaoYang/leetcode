package com.leetcodeDemo;

import java.util.HashSet;
import java.util.Set;

public class Demo03 {

	public static void main(String[] args) {
		String s = "pwwkew";
		System.out.println(demo02(s));
	}
	
	public static void demo01() {
		String s = "abcabc";
		Set<String> set = new HashSet<String>();
		if(s.length() > 1) {
			for (int i = 0; i < s.length(); i++) {
				char ch=s.charAt(i);
				String n = String.valueOf(ch);
				set.add(n);
			}
		}else {
			throw new RuntimeException("没有值");
		}
		int num = set.size();
		System.out.println(num);
	}
	
	public static int demo02(String s) {
		int n = s.length(), ans = 0, i = 0;
        int[] index = new int[128]; 
        for (int j = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
	}
	
}
