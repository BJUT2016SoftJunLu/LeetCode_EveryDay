package 七月算法.array;


/*
* 给一个数组，找出第一个不在里面的正整数。
  例如［3,4,-1,1]  输出2。

  思路：交换数组元素，使得数组中第i位存放数值(i+1)。最后遍历数组，寻找第一个不符合此要求的元素，返回其下标。
  整个过程需要遍历两次数组，复杂度为O(n)。
* */
public class Question_5 {

    public static int getMissNumber(int arrs[]){

        if(arrs == null || arrs.length == 0){
            return 1;
        }
        for(int i=0;i<arrs.length;){
            if(arrs[i] > 0 && arrs[i] != i + 1 && arrs[i]  <= arrs.length){
                int tmp = arrs[arrs[i] - 1];
                arrs[arrs[i] - 1] = arrs[i];
                arrs[i] = tmp;
            }else{
                i++;
            }
        }
        for(int i=0;i<arrs.length;i++){
            if(arrs[i] != i + 1){
                return i+1;
            }
        }

        return  arrs.length + 1;
    }


    public  static int firstMissingPositive(int[] A) {
        if (A == null || A.length < 1) return 1;

        //把小于等于A.length的正数A[i]放到第A[i]-1个位置上
        for (int i = 0; i < A.length; i++) {
            while (A[i] > 0 && A[i] <= A.length && A[i] != i + 1) {
                int tmp = A[A[i] - 1];
                A[A[i] - 1] = A[i];
                A[i] = tmp;
            }
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                return i + 1;
            }
        }

        return A.length + 1;
    }

    public static void main(String[] args) {
        int []arrs = {2,4,-1,1};
        System.out.println(Question_5.getMissNumber(arrs));



    }

}
