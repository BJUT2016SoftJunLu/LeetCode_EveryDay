/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    /*
     Time complexity : O(n^2)
    ​​ Space complexity : O(1)
    */
    public static int[] twoSum_versio1(int []nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] - nums[i] == target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("no  two sum solution");
    }

    /*
     Time complexity : O(n)
    ​​ Space complexity : O(n)
    */

    public static int[] twoSum_versio2(int []nums,int target){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i < nums.length;i ++){
            int complement = target - nums[i];
            if(map.containsKey(map.get(complement)) && map.get(complement) != i){
                return new int[]{i,map.get(complement)};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no two sum solution");
    }

    public static void main(String []args){

        int []nums =  new int[]{2, 7, 11, 15};
        int target = 9;
        int []result = twoSum_versio2(nums,target);
        System.out.println(result[0]+"  "+result[1]);
    }

}
