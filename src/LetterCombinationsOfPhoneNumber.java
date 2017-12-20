import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {

    public static HashMap<Integer,String> map = new HashMap<Integer,String>();

    static {
        map.put(2,"a,b,c");
        map.put(3,"d,e,f");
        map.put(4,"g,h,i");
        map.put(5,"j,k,l");
        map.put(6,"m,n,o");
        map.put(7,"p,q,r,s");
        map.put(8,"t,u,v");
        map.put(9,"w,x,y,z");
    }

    /*
    *  Time complexity : O(n^3)
    *  Space complexity : O(1)
    * */

    /*
    * 迭代法
    * */
    public static List<String> letterCombinations_version1(String digits) {

        List<String> result = new ArrayList<String>();
        String []tmp = digits.split(",");
        Integer []number = new Integer[tmp.length];
        for(int i=0;i<tmp.length;i++){
            number[i] = Integer.parseInt(tmp[i]);
        }
        Arrays.sort(number);

        String str1 = map.get(number[0]);
        for(int i=1;i<number.length;i++){
            String str2= map.get(number[i]);
            str1 = combinations(str1,str2);
        }

        String []word = str1.split(",");
        for(int i=0;i<word.length;i++){
            result.add(word[i]);
        }
        return result;
    }

    public static String combinations(String str1,String str2){

        String result = "";
        String []word1 = str1.split(",");
        String []word2 = str2.split(",");

        for(int i=0;i<word1.length;i++){
            for(int j=0;j<word2.length;j++){
                result = result + word1[i] + word2[j] + ",";
            }
        }
        return result.substring(0,result.length()-1);
    }



    /*
    *  Time complexity : O(n^2)
    *  Space complexity : O(1)
    * */

    /*
    * 递归方法
    * */
    public static void letterCombinations_version2(List<String> result,String tmpResult,String digits,String leftWord){

        if(digits.length()==0){
            String []words = tmpResult.split(",");
            for(String word:words){
                result.add(word);
            }
            return;
        }
        int number = Integer.parseInt(digits.substring(0,1));
        if(digits.length()>1){
            digits = digits.substring(2,digits.length());
        }else{
            digits = "";
        }
        if(leftWord.length()==0) {
            letterCombinations_version2(result,tmpResult, digits, map.get(number));
        }else{
            String rightWord = map.get(number);
            leftWord = combinations(leftWord,rightWord);
            tmpResult = leftWord;
            letterCombinations_version2(result,tmpResult,digits,leftWord);
        }

    }


    public static void main(String[] args) {

        List<String> result = new ArrayList<String>();
        letterCombinations_version2(result,"","2,3,6","");
        System.out.println(result.size());
        for(String str:result){
            System.out.print(str+",");
        }

    }

}
