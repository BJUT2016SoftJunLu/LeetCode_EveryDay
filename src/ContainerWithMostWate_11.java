

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

public class ContainerWithMostWate_11 {


    public static int MaxArea(int[] height){
        int left = 0, right = height.length - 1;
        int maxArea = 0;
        while (left < right){
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            if (height[left] > height[right]){
                right--;
            }else{
                left++;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        System.out.println(ContainerWithMostWate_11.MaxArea(new int[]{1,2,4,3}));
    }

}
