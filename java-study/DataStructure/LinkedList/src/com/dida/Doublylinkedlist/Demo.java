package com.dida.Doublylinkedlist;

/**
 * @author 23216
 * @version 1.0
 * @description: java实现双向链表
 * @date 2022/1/30 22:10
 */
public class Demo {
    public static void main(String[] args) {
        //创建节点
        DoublyHeroNode hero1 = new DoublyHeroNode(1, "宋江", "及时雨");
        DoublyHeroNode hero2 = new DoublyHeroNode(2, "卢俊义", "玉麒麟");
        DoublyHeroNode hero3 = new DoublyHeroNode(3, "吴用", "智多星");
        DoublyHeroNode hero4 = new DoublyHeroNode(4, "林冲", "豹子头");

        //放入链表中
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.add(hero1);
        doublyLinkedList.add(hero2);
        doublyLinkedList.add(hero3);
        doublyLinkedList.add(hero4);


        //显示
        doublyLinkedList.list();
    }
}

