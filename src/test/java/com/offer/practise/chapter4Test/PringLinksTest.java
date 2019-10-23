package com.offer.practise.chapter4Test;

import com.offer.practise.chapter4.ListNode;
import com.offer.practise.chapter4.PrintLinks;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author zhugp
 * @description TODO
 * @date 2019/10/11 15:35
 */
public class PringLinksTest {

    @Test
    public void printListByStack1Test() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;

        List<Integer> list = PrintLinks.printListByStack(node1);
        Arrays.asList(list).forEach(System.out::println);
    }

    @Test
    public void printListByStack2Test() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;

        List<Integer> list = PrintLinks.printListByStack2(node1);
        Arrays.asList(list).forEach(System.out::println);
    }




}
