package 七月算法.string;

/*
* 判断某个字符串是否为另一个字符串的字串
*
* */
public class Question_4 {

    public static boolean isSubString(String str,String sub){

        char []strchars = str.toCharArray();
        char []subChars = sub.toCharArray();

        int windowSize = sub.length();
         int tail = 0;
         int head = windowSize - 1;
         boolean result = false;
         while(head < str.length()){
             int i = 0;
             for(;i < sub.length();i++){
                 if(strchars[tail + i] != subChars[i]){
                     break;
                 }
             }
             if(i == sub.length()){
                 result = true;
                 break;
             }
             head++;
             tail++;
         }
        return result;
    }
}
