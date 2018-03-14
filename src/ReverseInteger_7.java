/*
*
* Input: 123
  Output:  321
* */

import java.util.InputMismatchException;

public class ReverseInteger_7 {

    public static Integer reverseInteger(int x){

        int result = 0;
        boolean isNative = x > 0 ? false:true;
        x = Math.abs(x);
        int tmp = 0;
        while(x > 0){
            tmp = result;
            result = result * 10 + x % 10;
            //防止溢出
            if((result - x % 10) / 10 != tmp){
                return 0;
            }
            x = x / 10;
        }
        if(isNative){
            result = - result;
        }
        return result;

    }

    public static void main(String []args){
        System.out.println(ReverseInteger_7.reverseInteger(-123));
    }

}
