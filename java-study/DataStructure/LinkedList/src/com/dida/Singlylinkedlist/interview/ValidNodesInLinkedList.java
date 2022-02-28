package com.dida.Singlylinkedlist.interview;

import com.dida.Singlylinkedlist.HeroNode;

/**
 * @author 23216
 * @version 1.0
 * @description: 求单链表中有效节点的个数
 * 使用一个辅助变量来计算有效节点
 * @date 2022/1/31 12:28
 */
public class ValidNodesInLinkedList {
    public static int getLength(HeroNode head){
        if (head.next == null){
            return 0;
        }
        int length = 0;
        //定义一个辅助变量
        HeroNode cur = head.next;
        //对链表进行遍历
        while (cur != null){
            length++;
            cur = cur.next;
        }
        return length;
    }
}
