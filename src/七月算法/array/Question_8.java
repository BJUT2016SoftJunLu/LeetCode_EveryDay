package 七月算法.array;

/*
*  寻找数组中的众数，假如众数存在
*
*  分析：众数出现的次数大于其他所有数出现次数之和，每次扔掉两个不同的数，众数不变
        1.如果扔掉一个众数，和一个非众数
        2.如果扔掉两个非众数
* */
public class Question_8 {

    public static int getMode(int []nums){
        int count = 0;
        int tmp = 0;
        for(int i = 0;i < nums.length;i++){
            if(count ==0){
                tmp = nums[i];
            }
            if(tmp == nums[i]){
                count ++;
            }else{
                count --;
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        int []nums = {1,2,3,4,4,4,4,4,8};
        System.out.println(Question_8.getMode(nums));
    }

}
