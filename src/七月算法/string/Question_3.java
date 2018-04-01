package 七月算法.string;

/*
* 一个字符串中只包含*和数字，请把它*号都放在前面
* */
public class Question_3 {

    //改变数字原有是顺序
    public static void moveChar_1(char []chars){
        int i=0,j=0;
        for(;j<chars.length;j++){
            if(chars[j] == '*'){
                char tmp = chars[j];
                chars[j] = chars[i];
                chars[i] = tmp;
                i++;
            }
        }
        System.out.println(chars);
    }

    //不改变数字原有是顺序
    public static void moveChar_2(char []chars){
        int head = chars.length - 1;
        int tail = head;
        for(;head >=0;head--){
            if(chars[head] >= '0' && chars[head] <= '9'){
                chars[tail--] = chars[head];
            }
        }
        for(;tail >=0;tail--){
            chars[tail] = '*';
        }
        System.out.println(chars);
    }

}
