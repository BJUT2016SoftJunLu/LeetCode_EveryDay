
/*
* 查找循环有序数组中的最小值(假设是数组中没有重复元素，而且是ascending)
* 4 5 6 7 0 1 2
* */
public class FindMinimumInRotatedSortedArray_153 {

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = (left + right)/2;
            if(nums[mid] < nums[right]){
                right = mid;
            }else if (nums[mid] > nums[right]) {
                left = mid+1;
            }
        }
        return nums[left];
    }


}
