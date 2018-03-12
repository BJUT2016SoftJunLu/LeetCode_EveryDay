
/*
* There are two sorted arrays nums1 and nums2 of size m and n respectively.
  Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

Example 1:
nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
* */

import java.util.ArrayList;

public class MedianOfTwoSortedArrays_4 {

    /*
    * 先将两个有序的数据合成一个有序的数组，然后再求中位数
    * */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2){

        double result = 0.0;
        ArrayList<Integer> tmpList =  new ArrayList<Integer>();
        int index1 = 0,index2 = 0;
        while(index1 < nums1.length && index2 < nums2.length){
            if(nums1[index1] <= nums2[index2]){
                tmpList.add(nums1[index1]);
                index1 ++;
            }else{
                tmpList.add(nums2[index2]);
                index2 ++;
            }
        }


        if(index1 == nums1.length){
            while(index2 < nums2.length){
                tmpList.add(nums2[index2++]);
            }
        }else if(index2 == nums2.length){
            while(index1 < nums1.length){
                tmpList.add(nums1[index1++]);
            }
        }


        if(tmpList.size()%2 == 0){
            int index = tmpList.size()/2 - 1;
            result  = (tmpList.get(index) + tmpList.get(index + 1))/2.0;
        }else{
            int index = tmpList.size()/2;
            result = tmpList.get(index);
        }
        return result;
    }

    public static void main(String[] args) {
        int []nums1 = new int[]{1, 2};
        int []nums2 = new int[]{3, 4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }



}
