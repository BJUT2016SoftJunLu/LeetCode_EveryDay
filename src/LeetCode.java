import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LeetCode {



    public static int [] towSum(int a[],int target){
        int []result = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i < a.length;i++){
            int diff = target - a[i];
            if(map.containsKey(diff)){
                result[0] = map.get(diff);
                result[1] = i;
            }
            map.put(a[i],i);
        }
        return result;
    }

    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2){

        LinkedList<Integer> resultList = new LinkedList<>();
        boolean isPlus = false;
        while(l1.size() > 0 && l2.size() >0){
            int l1Remove = l1.removeFirst();
            int l2Remove = l2.removeFirst();

            if(isPlus==false){
                if(l1Remove + l2Remove >= 10){
                    isPlus = true;
                    resultList.addLast( (l1Remove + l2Remove) % 10);
                }else{
                    resultList.addLast( l1Remove + l2Remove);
                }
            }else{
                if(l1Remove + l2Remove + 1 >= 10){
                    resultList.addLast( (l1Remove + l2Remove + 1) % 10);
                }else{
                    isPlus = false;
                    resultList.addLast( l1Remove + l2Remove + 1);
                }
            }
        }
        resultList.addAll(l1.size() > l2.size() ? l1:l2);
        return  resultList;

    }

    public static void main(String[] args) {

//        int []nums =  new int[]{2, 7, 11, 15};
//        int target = 9;
//        int []result = towSum(nums,target);
//        System.out.println(result[0] + "," + result[1]);


        LinkedList l1 = new LinkedList();
        l1.add(2);
        l1.add(4);
        l1.add(3);
        LinkedList l2 = new LinkedList();
        l2.add(5);
        l2.add(6);
        l2.add(4);
        LinkedList<Integer> resultList  = addTwoNumbers(l1,l2);
        for(int i : resultList){
            System.out.println(i);
        }

    }

}
