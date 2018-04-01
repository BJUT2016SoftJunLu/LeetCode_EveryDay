package 排序算法;

import java.util.*;

public class BucektSort {

    public static int[] sort(int[] num){
        int max = 0;
        int min = 0;
        for(int i : num){
            if(i>max){
                max = i;
            }
            if(i<min){
                min = i;
            }
        }
        int bucketSize = (max - min)/num.length + 1;
        //int bucketSize = (int) Math.ceil((double)(max - min) / (num.length - 1));
        int bucketNum = (max -min)/bucketSize + 1;

        ArrayList<ArrayList> buckets = new ArrayList<ArrayList>();

        for(int i=0;i<bucketSize;i++){
            ArrayList<Integer> bucket = new ArrayList<Integer>();
            buckets.add(bucket);
        }

        for(int i=0;i<num.length;i++){
            int index = (num[i] - min)/bucketSize;
            buckets.get(index).add(num[i]);
        }
        int sign = 0;
        for(int i=0;i<buckets.size();i++){
            if(buckets.get(i).size()>0){
                ArrayList<Integer> bucket = buckets.get(i);
                Integer []tmp = (Integer [])bucket.toArray(new Integer[bucket.size()]);
                Arrays.sort(tmp);
                for(int t:tmp){
                    num[sign] = t;
                    sign++;
                }
            }
        }

    return num;
    }

    public static void main(String[] args) {
        int[] a = new int[]{3,6,22,5,1};
        int []b = BucektSort.sort(a);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
