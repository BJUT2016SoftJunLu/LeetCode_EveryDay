package 七月算法.array;

import java.util.Arrays;
import java.util.HashSet;

/*
* 给定一个整数数组(n > 1)，求把这些整数表示在数轴上，相邻两个数差的最大值。
* 要求时间复杂度为线性
* */
public class Question_6 {

    public static int maximumGap(int[] num){

        if(num.length<2) return 0;
        int max = num[0];
        int min = num[0];

        for(int i:num){
            max = Math.max(max,i);
            min = Math.min(min,i);
        }
        if(num.length == 2) return max - min;
        //确定桶的大小
        int bucketSize = (max - min)/num.length + 1;
        //确定桶的个数
        int bucketNumber = (max - min)/bucketSize + 1;

        int []maxBuckets = new int[bucketNumber];
        int []minBuckets = new int[bucketNumber];
        Arrays.fill(maxBuckets,Integer.MIN_VALUE);
        Arrays.fill(minBuckets,Integer.MAX_VALUE);
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<num.length;i++){
            //确定数据所在桶的索引
            int index = (num[i] - min)/bucketSize;
            minBuckets[index] = Math.min(num[i],minBuckets[index]);
            maxBuckets[index] = Math.max(num[i],maxBuckets[index]);
            set.add(index);
        }

        int pre = 0;
        int result = 0;
        for(int i=1;i<num.length;i++){
            if(!set.contains(i)){
                continue;
            }
            result = Math.max(result,(minBuckets[i] - maxBuckets[pre]));
            pre = i;
        }
        return result;

    }

    public static void main(String[] args) {
        int []a = {1,3,100};
        System.out.println(Question_6.maximumGap(a));
    }

}
