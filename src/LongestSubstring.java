
/*
* Given a string, find the substring of the longest  without repeating characters.
* */

import org.omg.CORBA.MARSHAL;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {


    /*
    Time complexity : O(n^2)
​​    Space complexity : O(1)
    */
    public static Integer getLongestSubString_version1(String str){

        int longest_start = 0;
        int longest_end = 0;
        int longest = 0;
        String []chars = str.split("");

        for(int head = 0; head < chars.length - 1; head ++){
            for(int tail = head + 1; tail < chars.length; tail ++){
                if(chars[head].equals(chars[tail]) && head!=tail){
                    if((tail - head) > longest){
                        longest_start = head;
                        longest_end = tail;
                        longest = tail - head;
                    }
                    break;
                }
            }
        }
        return longest;
    }


    /*
      Sliding Window
    * Time complexity : O(n)
    * Space complexity : O(n)
    * */

    public static Integer getLongestSubString_version2(String str){


        Set<Character> set = new HashSet<Character>();
        int length = str.length();
        int result = 0;
        int j=0,i =0;
        while(j < length && i < length){
            if(!set.contains(str.charAt(i))){
                set.add(str.charAt(i++));
                result = Math.max(result,i - j);
            }else{
                set.remove(str.charAt(j++));
            }
        }
        return result;
    }

    public static void main(String []args){
        System.out.println(LongestSubstring.getLongestSubString_version2("jkklmmds"));
    }


}
