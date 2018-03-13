/*
*
* Given a string s, find the longest palindromic substring in s
* */

public class LongestPalindromicSubString_5 {

    /*
    *   Dynamic Programming
    *
    *   状态dp[j][i]表示索引j到索引i的子串是否是回文串
    *   dp[j][i] = true                             j = i
    *   dp[j][i] = (str[i]==str[j])                 i - j = 1
    *   dp[j][i] = (str[i]==str[j]&&dp[j+1][i-1])   i - j > 1
    * */



    public static String longestPalindrome(String str){
        String result = "";

        boolean mark = false;
        int start = 0;
        int maxLength = 0;

        for(int i=0;i<str.length();i++){
            for(int j=0;j<i;j++){
                if(i - j == 1){
                    mark = str.charAt(i) == str.charAt(j) ? true:false;
                }else if(i - j > 1){
                    mark = isPalindromic(str.substring(j,i + 1));
                }
                if(mark == true && maxLength < (i - j + 1)){
                    maxLength = i - j + 1;
                    start = j;
                }
                mark = false;
            }
        }

        result = str.substring(start,start + maxLength);

        return result;
    }


    /*
    * 判断
    * */
    public static boolean isPalindromic(String str){

        if(str == null || str.length() == 0){
            return false;
        }
        if(str.length() == 1){
            return true;
        }
        if(str.length() == 2){
            return str.charAt(0) == str.charAt(1) ? true:false;
        }

        if(str.charAt(0) == str.charAt(str.length() - 1)){
            return isPalindromic(str.substring(1,str.length() - 1));
        }else{
            return false;
        }
    }






    public static void main(String []args){

        String s = "abbaabccba";

        System.out.println(longestPalindrome(s));

    }


}
