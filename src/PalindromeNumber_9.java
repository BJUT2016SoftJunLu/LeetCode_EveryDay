
/*
* Determine whether an integer is a palindrome. Do this without extra space.
* */


public class PalindromeNumber_9 {

    public static boolean isPalindrome(int number){
        //先将整数reverse，然后在比较是否相等
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

    public static void main(String[] args) {
        int number = 123321;
        System.out.println(isPalindrome(number));
    }

}
