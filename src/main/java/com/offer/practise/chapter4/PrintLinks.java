package com.offer.practise.chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author zhugp
 * @description TODO
 * @date 2019/10/11 15:20
 */
public class PrintLinks {


    /**
     * @author zhugp
     * @description 利用栈实现反向打印
     * @date 2019/10/11 15:40
     * @param head
     * @return java.util.List<java.lang.Integer>
     **/
    public static List<Integer> printListByStack(ListNode head) {
        List<Integer> list = new ArrayList<>();
        Stack<ListNode> stack = new Stack<>();

        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        while (!stack.isEmpty()) {
            list.add(stack.pop().data);
        }
        return list;
    }


    /**
     * @author zhugp
     * @description 递归  底层还是栈
     * @date 2019/10/11 15:47
     * @param node
     * @return java.util.List<java.lang.Integer>
     **/
    public static List<Integer> printListByStack2(ListNode node) {
        List<Integer> list = new ArrayList<>();
        if (node != null) {
            if (node.next != null) {
                list = printListByStack2(node.next);
            }
            list.add(node.data);
        }

        return list;
    }

}
