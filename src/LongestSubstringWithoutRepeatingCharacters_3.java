import java.util.Arrays;
import java.util.HashSet;

/*
* 求最大子串、最大子串长度
* */
public class LongestSubstringWithoutRepeatingCharacters_3 {


    /*
      Sliding Window
    * Time complexity : O(n)
    * Space complexity : O(n)
    * */
    public static String maxSubString(String str,int length){
        String maxSub = "";
        Integer maxSize = 0;
        HashSet<Character> set = new HashSet<Character>();
        int i = 0,j = 0;
        while(i < length && j < length){
            if(!set.contains(str.charAt(j))){
                set.add(str.charAt(j++));
                maxSub = maxSub.length() < (j - i) ? str.substring(i,j):maxSub;
            }else{
                set.remove(str.charAt(i++));
            }
        }
        return maxSub;
    }
}
