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


    public static String longestPalindrom_version1(String s){
        int length = s.length();
        int start = 0;
        int max_length = 1;
        boolean is_pal = false;
        for(int i = 0;i < length;i ++){
            for(int j = 0;j <= i;j ++){
                if(i - j == 0){
                    is_pal = true;
                }else if(i - j  == 1){
                    is_pal = s.charAt(j) == s.charAt(i) ? true:false;
                }else{
                    if(s.charAt(j) == s.charAt(i) && s.charAt(i - 1) == s.charAt(j + 1)){
                        is_pal = true;
                    }
                }
                if(is_pal==true && max_length < (i - j + 1)){
                    max_length = i - j + 1;
                    start = j;
                }
                is_pal = false;
            }
        }
        return start+"    "+max_length;
    }





    public static void main(String []args){

        String s = "caba";
        System.out.println(LongestPalindromicSubString_5.longestPalindrom_version1(s));

    }


}
