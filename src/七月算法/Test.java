package 七月算法;

import 七月算法.string.*;

public class Test {


    public static  void Question_1_Test(){
        String str = "01001";
        System.out.println(Question_1.getSwapNumber(str));
    }

    public static  void Question_2_Test(){
        char []chars= {'a','d','e','a','f','a','g','a','#','#','#'};
        Question_2.deteleChar(chars,'a');
    }

    public static  void Question_3_Test(){
        char []chars= {'*','0','1','*','2','*','4'};
        Question_3.moveChar_2(chars);
    }

    public static  void Question_4_Test(){
        System.out.println(Question_4.isSubString("eruowabcedf","abc"));
    }

    public static  void Question_5_Test(){
        Question_5.reverse("I am a  high school Student");
    }

    public static  void Question_6_Test(){
        int []arrs = new int[]{7,9,10,-1,2,3,4};
        System.out.println(Practice.getElement(arrs,7));
    }

    public static void main(String[] args) {

        Question_6_Test();
    }


}
