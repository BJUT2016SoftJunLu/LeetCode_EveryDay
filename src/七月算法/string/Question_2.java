package 七月算法.string;

/*
* 删除字符串中的指定的某个字符(假设字符数组足够大)
* */
public class Question_2 {

    public static void deteleChar(char []str,char c){
        int i = 0 , j = 0;
        for(;j < str.length; j++){
            if(str[j] != c){
                str[i++] = str[j];
            }
        }
        str[i] = '#';
        System.out.println(str);
    }
}
