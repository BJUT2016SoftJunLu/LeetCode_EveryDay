

/*
* 求一组数组中3个元素相加结果为0的所有不重复组合
*
*
* For example, given array S = [-1, 0, 1, 2, -1, -4],
  A solution set is:
  [[-1, 0, 1],[-1, -1, 2]]
* */

import java.util.*;

public class Sum3_15 {

    /*
    *  Time complexity : O(n^3)
    *  Space complexity : O(1)
    * */
    public static List<Integer[]> Sum3_version1(Integer []num){
        List<Integer[]> result = new ArrayList<Integer[]>();
        for(int i=0;i<num.length-2;i++){
            for(int j=i+1;j<num.length-1;j++){
                for(int h=j+1;h<num.length;h++){
                    if((num[i] + num[j] + num[h])==0){
                        Integer []element = new Integer[3];
                        element[0] = num[i];element[1] = num[j];element[2] = num[h];
                        Arrays.sort(element);
                        if(!isExist(result,element)){
                            result.add(element);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static boolean  isExist(List<Integer[]> result,Integer []num){

        for(Integer[] element:result){
            for(int i=0;i<element.length;i++){
                if(element[i]==num[i] && i == 2){
                    return true;
                }
            }
        }
        return false;
    }


    /*
    *  Time complexity : O(n^2)
    *  Space complexity : O(1)
    * */

    public static List<Integer[]> Sum3_version2(int []num){

        List<Integer[]> result = new ArrayList<Integer[]>();
        Arrays.sort(num);
        for(int i=0;i<num.length-2;i++){
            if(num[i]>0){
                break;
            }
            if(i > 0 && num[i] == num[i-1]){
                continue;
            }
            int sum = 0 - num[i];
            int []tmp = (int[]) Arrays.copyOfRange(num,i+1,num.length);
            if(tmp.length == 2){
                if(tmp[0]+tmp[1]==sum){
                    Integer []element = new Integer[3];
                    element[0]=-sum;element[1]=tmp[0];element[2]=tmp[1];
                    result.add(element);
                }
            }else{
                List<Integer[]> tmp_result = find_all_target(tmp,sum);
                if(tmp_result.size()==2){
                    for(Integer[]e:tmp_result){
                        Integer []element = new Integer[3];
                        element[0]=-sum;element[1]=e[0];element[2]=e[1];
                        result.add(element);
                    }
                }
            }
        }
        return result;
    }

    /*
    * 返回数组中所有满足目标的组合
    * */
    public static List<Integer[]>  find_all_target(int []nums,int target){
        List<Integer[]> result = new ArrayList<Integer[]>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i < nums.length;i ++){
            int sum = target - nums[i];
            if(map.containsKey(sum)){
                Integer[] tmp = new Integer[]{sum,nums[i]};
                result.add(tmp);
            }
            map.put(nums[i],i);
        }
        return result;
    }


    public static void main(String[] args) {

        List<Integer[]> result = Sum3_15.Sum3_version2(new int[]{-1, 0, 1, 2, -1, -4});
        for(Integer[] array:result){
            for(Integer number:array){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
