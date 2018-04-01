package 七月算法.array;

/*
* 查找循环有序数组中的最小值(假设是数组中没有重复元素，而且是ascending)
* 4 5 6 7 0 1 2
* */
public class Question_2 {


    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right)/2;
        while(left < right){
            mid = (left + right)/2;
            if(nums[mid] > nums[left]){
                left = mid;
            }else if(nums[mid] < nums[left]){
                right = mid;
            }else{
                mid++;
                break;
            }
        }
        return nums[mid];
    }

    public static void main(String[] args) {
        int []number = {4,5,6,7,0,1,2};
        System.out.println(Question_2.findMin(number));
    }

}
