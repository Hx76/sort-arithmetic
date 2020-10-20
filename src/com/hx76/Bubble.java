package com.hx76;

/**
 * 冒泡排序
 */
public class Bubble {
    public static int[] bubbleSort(int[] nums){
        int temp = 0;
        for (int i=0;i<nums.length;i++){
            for (int j=nums.length-1;j>i;j--){
                //从小到大排序
                if (nums[i]>nums[j]){
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {5,4,26,9,8,2,6};
        for (int i : bubbleSort(nums)) {
            System.out.println(i);
        }
    }
}
