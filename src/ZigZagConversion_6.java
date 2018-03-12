
/*
*
*
*
*   n=2时，字符串坐标变成zigzag的走法就是:
    0 2 4 6
    1 3 5 7
    n=3时的走法是:
    0     4     8      2 * numRows - 2;
    1  3 5  7 9        2 * nRows - 2 - 2 * i;
    2     6    10      2 * numRows - 2;
    n=4时的走法是:
    0      6        12
    1   5 7    11 13
    2 4   8 10    14
    3      9         15
* */

public class ZigZagConversion_6 {

    public static String convert(String str,int numRows){
        StringBuilder sb =  new StringBuilder();
        int size = 2 * numRows - 2;
        for(int i = 0;i < numRows; i++){
            for(int j=i;j<str.length();j+=size){
                sb.append(str.charAt(j));
                if(i!=0 && i!=numRows-1){
                    int tmp = j + size - 2*i;
                    if(tmp < str.length()){
                        sb.append(str.charAt(tmp));
                    }
                }
            }
        }
        return sb.toString();
    }

    public static void main(String []args){

        System.out.println(zigZagConversion("PAYPALISHIRING",3));
    }


    public static String zigZagConversion(String str,int rowNumber){

        String result = "";
        String []rows = new String[rowNumber];

        //初始化
        for(int i = 0;i < rows.length;i++){
            rows[i] = "";
        }

        boolean mark = false;
        int i = 0;
        while(i < str.length()){
            int row = 0;
            for(;row < rowNumber;row ++){
                System.out.println("下" + i);
                rows[row] = rows[row] + str.charAt(i);
                i = i + 1;
                if(i == str.length()){
                    mark = true;
                    break;
                }

            }
            if(mark == true){
                break;
            }
            row = row -2;
            for(;row > 0;row-- ){
                System.out.println("上" + i);
                rows[row] = rows[row] + str.charAt(i);
                i = i + 1;
                if(i == str.length()){
                    mark = true;
                    break;
                }

            }
            if(mark == true){
                break;
            }
        }
        for(String s:rows){
            System.out.println(s);
            result = result + s;
        }
        return  result;
    }

}
