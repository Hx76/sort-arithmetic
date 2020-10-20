package com.hx76;

/**
 * 选择排序
 */
public class Selection {
    public static int[] selectionSort(int[] nums){
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j< nums.length;j++){
                //从小到大
                if (nums[j]<nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {5,4,26,9,8,2,6};
        for (int i : selectionSort(nums)) {
            System.out.println(i);
        }
    }
}
