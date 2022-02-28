package com.dida.Singlylinkedlist;

/**
 * @author 23216
 * @version 1.0
 * @description: java实现单向链表
 * @date 2022/1/30 22:10
 */
public class Demo {
    public static void main(String[] args) {
        //创建节点
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");

        //放入链表中
        SingleLinkedList singleLinkedList = new SingleLinkedList();
//        singleLinkedList.add(hero1);
//        singleLinkedList.add(hero2);
//        singleLinkedList.add(hero3);
//        singleLinkedList.add(hero4);

        //使用第二种方式插入到链表中
        singleLinkedList.add2(hero1);
        singleLinkedList.add2(hero4);
        singleLinkedList.add2(hero3);
        singleLinkedList.add2(hero2);


        //显示
        singleLinkedList.list();
    }
}

