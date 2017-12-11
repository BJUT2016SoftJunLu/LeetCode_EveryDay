
/*
*
* 给定n个非负整数a1,a2,...,an，其中每个代表一个点坐标（i,ai）。 n个垂直线段例如线段的两个端点在（i,ai）和（i,0）。
* 找到两个线段，与x轴形成一个容器，使其包含最多的水。.
*
*
* 如果容器盛水最多
    1.矩形面积最大。
    2.盛水量的多少，由两条垂线中较短的一条决定。
*
* */

public class ContainerWithMostWater {


    public static int maxArea(int []heights){

        int left = 0,right = heights.length - 1;
        int maxArea = 0;
        while(left < right){
            maxArea = Math.max(maxArea,Math.min(heights[left],heights[right]) * right - left);
            if(heights[left] < heights[right]){
                left ++;
            }else{
                right --;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        System.out.println(ContainerWithMostWater.maxArea(new int[]{10,45,4,88,65,21,33}));
    }

}
