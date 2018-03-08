
/*
*
* You are given two non-empty linked lists representing two non-negative integers.
* The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
  You may assume the two numbers do not contain any leading zero, except the number 0 itself.

    Example   (加法的实现算法)
    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8
    Explanation: 342 + 465 = 807.
* */

import java.util.LinkedList;

public class AddTwoNumbers_2 {

    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {

        LinkedList result_list = new LinkedList();

        int carry = 0;

        while(l1.size() > 0 && l2.size() > 0){
            int l1_number = l1.removeFirst();
            int l2_number = l2.removeFirst();
            int sum = 0;

            if(carry == 1){
                sum = l1_number + l2_number + carry;
            }else{
                sum = l1_number + l2_number;
            }
            carry = sum/10;
            if(carry == 0){
                result_list.addLast(sum);
            }else{
                result_list.addLast(sum%10);
            }
        }

        result_list.add(l1.size() > l2.size() ? l1:l2);

        return result_list;
    }


    public static void main(String []args){

        LinkedList l1 = new LinkedList();
        l1.add(0);
        l1.add(1);
        LinkedList l2 = new LinkedList();
        l2.add(0);
        l2.add(1);
        l2.add(2);

        LinkedList result_list = AddTwoNumbers_2.addTwoNumbers(l1,l2);
        for(int i = 0;i < result_list.size();i ++){
            System.out.println(result_list.get(i));
        }



    }

}

