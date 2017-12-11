
/*
* Determine whether an integer is a palindrome. Do this without extra space.
* */


public class PalindromeNumber {


    public static boolean isPalindromeNumber(int number){

        int a = 0,b = number;
        while(b != 0){
            a = a * 10 + b % 10;
            b = b / 10;
        }
        if(a == number){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String []args){
        System.out.println(PalindromeNumber.isPalindromeNumber(1212));
    }

}
