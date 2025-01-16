package com.generalprojects;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int compliment = target - nums[i];
            if(numMap.containsKey(compliment)){
                return new int[]{numMap.get(compliment), i};
                }
            numMap.put(nums[i], i);
            }
        throw new IllegalArgumentException("No two sum solution");
        }
    public static int[] sumSum(int [] prices, int target2 ){
        Map<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0; i<prices.length; i++){
            int compliment = target2 - prices[i];
            if(mpp.containsKey(compliment)){
                return new int[]{mpp.get(compliment), i};
            }
            mpp.put(prices[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2,11,7,15};
        int[] prices = {2,11,7,15};
        int target = 9;
        int target2 = 26;
        int[] result = twoSum(nums, target);
        int[] result2 = sumSum(prices, target2);
        System.out.println("indices at: " + result[0] + " and " + result[1]);
        System.out.println("indices at: " + result2[0] + " and " + result2[1]);
    }
}
