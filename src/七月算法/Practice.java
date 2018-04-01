package 七月算法;

public class Practice {



/*
*    查找循环有序数组中的指定元素
* */

    public static int getElement(int []arrs,int target){

        int left = 0;
        int right = arrs.length - 1;
        while(left<=right){
            int mid = (left + right) / 2;
            if(arrs[mid] == target){
                return mid;
            }
            if(arrs[mid] > arrs[left]){
                if(target >= arrs[left] && target < arrs[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else{
                if(target >= arrs[mid] && target <= arrs[right]){
                    left = mid  + 1;
                }else{
                    right = mid  - 1;
                }
            }
        }
        return -1;

    }


    public static void main(String[] args) {

        System.out.println(0/0);
    }


}
