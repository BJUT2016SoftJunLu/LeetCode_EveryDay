
/*
*
*  求N个字符串的最长相同前缀
*
* */


/*
*  Time complexity : O(n)
*  Space complexity : O(1)
* */
public class LongestCommonPrefix {

    public static String getLongestCommonPrefix(String []str){
        String result = "";
        int length = str.length;
        boolean sign = true;
        int index = 0,num = 0;

        while(num < length -1){
            if(str[num].charAt(index) == str[num + 1].charAt(index)){
                if(num + 1 == length - 1){
                    result = result + str[num].charAt(index);
                    index++;
                    num = 0;
                }else{
                    num ++;
                }
            }else{
                break;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(LongestCommonPrefix.getLongestCommonPrefix(new String[]{"123asdf","123dfgsd","123dfasdf"}));
    }

}
