package 七月算法.array;

/*
* 在有序数组中查找arr[x] == x的元素
*
* */
public class Question_3 {

    public static int findNumber(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = (left + right)/2;
            if(nums[mid] == mid){
                return mid;
            }else if(nums[mid] > mid){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []number = {-5,1,4,5,7,9,20};
        System.out.println(Question_3.findNumber(number));
    }
}
