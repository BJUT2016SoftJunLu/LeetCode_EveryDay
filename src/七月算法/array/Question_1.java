package 七月算法.array;


/*
* 实现二分查找算法（数组有序）
* */
public class Question_1 {

    public static int binarySearch(int []arr,int number){

        int head = 0;
        int tail = arr.length - 1;
        while(head <= tail){
            int mid = (head + tail)/2;
            if(arr[mid] == number){
                return mid;
            }else if(arr[mid] > number){
                tail = mid - 1;
            }else{
                head = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr = {1,4,6,8,9,10,22,55,74};
        System.out.println(binarySearch(arr,6));
    }


}
