package 七月算法.string;


/*
* 把一个0-1串进行排序，你可以交换任意两个位置，问最少交换的次数?（所有0在前1在后）
*
* */
public class Question_1 {

    public static int getSwapNumber(String str){

        char []numbers = str.toCharArray();

        int result = 0;
        int i = 0,j = str.length() - 1;

        while(i<=j){
            while(numbers[i]=='0'&&i<=j){
                i++;
            }
            while(numbers[j]=='1'&&j>=i){
                j--;
            }
            if(i<j){
                result++;
            }
            i++;
            j--;
        }
        return result;
    }
}
