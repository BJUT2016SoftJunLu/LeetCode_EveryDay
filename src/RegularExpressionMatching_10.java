

/*
* Implement regular expression matching with support for '.' and '*'.
* */
public class RegularExpressionMatching_10 {

    public static boolean isMatch(String s, String p) {

        boolean [][]sign = new boolean[p.length()+1][s.length()+1];
        //初始化
        sign[0][0] = true;
        //初始化第一行，第一列，对于P中是'*'的字符,取sign中前2个结果
        for(int i = 2;i < p.length();i++){
            if(p.charAt(i - 1) == '*'){
                sign[i][0] = sign[i-2][0];
            }
        }


        for(int m = 1;m < s.length();m++){
            for(int n = 1;n < p.length();n++){
                if(p.charAt(n - 1) == '.' || s.charAt(m - 1) == p.charAt(n - 1)){
                    /*
                    * 第一种情况:s,p总最后一个字符相等
                    * 若s,p前面的字符都匹配，则s,p匹配
                    */
                    sign[n][m] = sign[n - 1][m - 1];
                }else if(p.charAt(n - 1) == '*'){
                    if(p.charAt(n - 2) == s.charAt(m - 1) || p.charAt(n - 2) == '.'){
                       /*
                       * 第二种情况:p的最后一个字符是"*",而且p的倒数第三位和s的最后一位相等
                       * 若s最后一个字符之前的所有字符和整个p匹配，则s,p匹配
                     * */
                        sign[n][m] = sign[n][m - 1];
                    }else{
                      /*
                       * 第二种情况:p的最后一个字符是"*"
                       * 若s整体与*前一个字符之前全部字符匹配，则s,p匹配
                     * */
                        sign[n][m] = sign[n - 2][m];
                    }
                }
            }
        }

        for(int i = 0;i < p.length() + 1;i++){
            for(int j = 0;j < s.length() + 1;j++){
                System.out.print(sign[i][j] + " ");
            }
            System.out.println("");
        }

        return sign[p.length()][s.length()];
    }

    public static void main(String[] args) {
        isMatch("aab","c*a*b");
    }


}
