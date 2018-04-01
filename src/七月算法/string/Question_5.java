package 七月算法.string;

/*
* 翻转句子中的所有单词，但是单词内容不变
* */

public class Question_5 {

    public static void reverse(String str){
        char []chars = str.toCharArray();

        swap(chars,0,str.length() - 1);
        int start = 0;
        int end = 0;
        while(end < str.length()){
            if(chars[end] == ' '){
                swap(chars,start,end);
                start = end + 1;
            }
            end++;
        }

        System.out.println(chars);
    }

    public static void swap(char []chars,int start,int end){
        while (start < end){
            char tmp=  chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;
            start ++;
            end --;
        }
    }
}
