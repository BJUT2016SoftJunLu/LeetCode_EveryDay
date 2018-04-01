package 七月算法.array;


/*
* 一个整形数组中所有元素都出现2次，但是有一个元素例外，求这个元素?
* 要求：时间复杂度为线性的，并且不申请额外的空间
* */
public class Question_7 {
    public static int singleNumber(int[] nums) {
       int result = 0;
       for(int num:nums){
           /*
           * 相同的两个数的异或结果是0
           * 1 ^ 1 = 0
           * 1 ^ 2 ^ 1 ^ 2 = 0
           * 1 ^ 2 ^ 1 ^ 2 ^ 3 = 3
           *
           * 使用 ^ 可以在不引入第三方变量的情况下进行变量交换
           * */
           result = result ^ num;
       }
       return result;
    }


    public static void main(String[] args) {
        int []nums = new int[]{1,2,1,2,3,3,4};

    }

}
