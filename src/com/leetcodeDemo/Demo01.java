package com.leetcodeDemo;

import java.util.Iterator;

public class Demo01 {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 8, 9, 10, 1, 5, 4 };
		int target = 9;
		int[] ber = twoSum(nums, target);
		for(int num : ber) {
			System.out.print(num);
		}
		System.out.println();
		demo01();
	}

	public static void demo01() {
		int[] nums = { 2, 7, 8, 9, 10, 1, 5, 4 };
		String[] num = new String[nums.length * 2];
		int target = 9;

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if ((nums[i] + nums[j]) == target) {
					num[i] = "[" + i + "," + j + "]";
				}
			}
		}
		
		for (String number : num) {
			if (number != null) {
				System.out.print(number + ",");
			}
		}

	}
	//返回 [1,0]  实际返回[1,0],[5,2],[7,6]
	public static int[] twoSum(int[] nums, int target) {
		int[] num = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < i; j ++) {
				if ((nums[i] + nums[j]) == target) {
//					return new int[] { i, j };
					num[i*2] = i;
					num[i*2 + 1] = j;
					/**
					 *  0*2=0;
					 *  1*2-1=1
					 *  1*2  =2
					 *  2*2-1=3
					 *  2*2  =4
					 *  3*2-1=5
					 *  3*2  =6
					 */
				}
			}
		}
		return num;
	}

}
