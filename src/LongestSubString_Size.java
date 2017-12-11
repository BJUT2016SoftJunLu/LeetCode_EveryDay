import java.util.Arrays;
import java.util.HashSet;

/*
* 求最大子串、最大子串长度
* */
public class LongestSubString_Size {


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


    /*
      Sliding Window
    * Time complexity : O(n)
    * Space complexity : O(n)
    * */
    public static Integer maxSubSize(String str,int length){

        Integer maxSize = 0;
        HashSet<Character> set = new HashSet<Character>();
        int i = 0,j = 0;
        while(i < length && j<length){
            if(!set.contains(str.charAt(j))){
                set.add(str.charAt(j++));
                maxSize = Math.max(maxSize,j - i);
            }else{
                set.remove(str.charAt(i++));
            }
        }
        return maxSize;
    }


    public static void main(String []args){
        String str = "jkklmmds";
        int length = str.length();
        System.out.println(LongestSubString_Size.maxSubString(str,length));
        System.out.println(LongestSubString_Size.maxSubSize(str,length));


        String indexName = "test-日期-维度-期刊 ";
        String []name_dimension = Arrays.copyOfRange(indexName.split("-"),1,indexName.split("-").length);

        Arrays.sort(name_dimension);

        for(String name:name_dimension){
            System.out.print(name);
        }
    }

}
