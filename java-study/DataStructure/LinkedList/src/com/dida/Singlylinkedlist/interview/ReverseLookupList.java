package com.dida.Singlylinkedlist.interview;

import com.dida.Singlylinkedlist.HeroNode;

import static com.dida.Singlylinkedlist.interview.ValidNodesInLinkedList.getLength;

/**
 * @author 23216
 * @version 1.0
 * @description: 查找单链表中倒数第k个节点
 * @date 2022/1/31 12:40
 */
public class ReverseLookupList {
    public static HeroNode findLastIndexNode(HeroNode head,int index){
        //判断是否为空
        if (head.next == null){
            return null;
        }
        //第一次遍历得到链表长度
        int size = getLength(head);
        //第二次遍历
        if (index <= 0 || index > size){
            return null;
        }
        HeroNode cur = head.next;
        for (int i = 0; i < size - index; i++) {
            cur = cur.next;
        }
        return cur;
    }
}
