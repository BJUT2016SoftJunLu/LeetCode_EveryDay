/*
*
* Input: 123
  Output:  321
* */

public class ReverseInteger_7 {


    public static Integer reverseInteger(int x){

        int a = 0,b = x;
        while(b > 0){
            //先求摸，后乘10
            a = a * 10 + b % 10;
            b = b / 10;
        }
        return a;
    }

    public static void main(String []args){
        System.out.println(ReverseInteger_7.reverseInteger(123));
    }

}
