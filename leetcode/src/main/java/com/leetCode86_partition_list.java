package com;

import com.data.ListNode;

/**
 * Class leetCode86_partition_list ...
 * 给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。
 *
 * 你应当保留两个分区中每个节点的初始相对位置。
 *
 * 示例:
 *
 * 输入: head = 1->4->3->2->5->2, x = 3
 * 输出: 1->2->2->4->3->5
 *
 * @author LiJun
 * Created on 2019/4/23
 */
public class leetCode86_partition_list {
    class Solution {
        public ListNode partition(ListNode head, int x) {
            ListNode lessHead = new ListNode(0);
            ListNode moreHead = new ListNode(1);
            ListNode p1 = lessHead;
            ListNode p2 = moreHead;
            while(head != null){
                if(head.val < x){
                    p1.next = head;
                    p1 = p1.next;
                }else {
                    p2.next = head;
                    p2 = p2.next;
                }
                head = head.next;
            }
            p1.next = moreHead.next;
            return lessHead.next;
        }
    }
}