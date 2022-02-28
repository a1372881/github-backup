package com.dida.Doublylinkedlist;

/**
 * @author 23216
 * @version 1.0
 * @description: 用来管理节点的双向链表
 * @date 2022/1/30 22:13
 */
public class DoublyLinkedList {
    /**
     * 初始化一个头节点
     * 保持为空
     */
    private DoublyHeroNode head = new DoublyHeroNode(0,"","");

    /**
     * 返回一个头节点
     * @return
     */
    public DoublyHeroNode getHead(){
        return head;
    }


    /**
     * 向链表尾部添加节点
     * @param heroNode
     * 插入到链表尾部的思路
     * 1.找到尾节点
     * 2.将尾节点的next指向新节点
     */
    public void add(DoublyHeroNode heroNode){


        //辅助指针，用来遍历链表
        DoublyHeroNode temp = head;
        while (true){
            //找到链表的尾部
            if (temp.next == null){
                break;
            }
            //没有找到就后移
            temp = temp.next;
        }
        //退出while循环说明已经找到了链表的最后
        //将刚添加的节点加入尾部
        temp.next = heroNode;
        heroNode.pre = temp;
    }

    /**
     * 修改节点的信息
     * @param newHeroNode
     * 根据no编号修改
     * 1.根据no找到要修改的节点，进行修改
     */
    public void update(DoublyHeroNode newHeroNode){
        //保证不为空
        if (head.next == null){
            System.out.println("当前链表是空的");
            return;
        }
        //定义一个辅助指针
        DoublyHeroNode temp = head.next;
        //定义一个布尔值表示是否找到该节点
        boolean flag = false;
        //查找该节点
        while (true) {
            if (temp == null) {
                break;
            }
            //编号是否相等
            if (temp.no == newHeroNode.no) {
                flag = true;
                break;
            }
        }
            //通过flag的值判断是否找到要修改的节点
            if (flag){
                temp.name = newHeroNode.name;
                temp.nickname =  newHeroNode.nickname;
            }else {
                System.out.printf("没有找到编号为%d的节点",newHeroNode.no);
            }
        }


    /**
     * 根据no编号删除节点
     * @param no
     * 1.根据no编号查找到要删除的节点的前一个节点
     * 2.修改前一个节点的下一个节点指向的值
     */
    public void del(int no){
        DoublyHeroNode temp = head.next;
        boolean flag = false;
        //遍历链表
        while (true) {
            //判断是否到链表的最后
            if (temp == null) {
                break;
            }
            if (temp.no == no) {
                //temp.next = temp.next.next;
                flag = true;
                break;
            }
            temp = temp.next;
        }
            if (flag){
                //将要删除的节点的上一个节点的下一个指向为要删除节点的下一个
                temp.pre.next = temp.next;
                //如果是最后一个节点了
                if (temp.next != null){
                    //将要删除节点的下一个节点的上一个节点指向为要删除节点的上一个节点
                    temp.next.pre = temp.pre;
                }
            }else {
                System.out.printf("要删除的节点 %d 不存在",no);
            }
        }


    /**
     * 显示当前链表所有的节点
     * 思路
     * 1.输出节点
     * 2.将节点后移
     */
    public void list(){
        if (head.next == null){
            System.out.println("链表为空");
            return;
        }
        //定义一个辅助指针
        DoublyHeroNode temp = head.next;
        //循环遍历
        while (true){
            if (temp == null){
                break;
            }
            //输出节点信息
            System.out.println(temp);
            //后移
            temp = temp.next;
        }
    }



}
