package com.dida.Singlylinkedlist;

/**
 * @author 23216
 * @version 1.0
 * @description: 用来管理节点的链表
 * @date 2022/1/30 22:13
 */
public class SingleLinkedList {
    /**
     * 初始化一个头节点
     * 保持为空
     */
    private HeroNode head = new HeroNode(0,"","");

    /**
     * 向链表尾部添加节点
     * @param heroNode
     * 插入到链表尾部的思路
     * 1.找到尾节点
     * 2.将尾节点的next指向新节点
     */
    public void add(HeroNode heroNode){

        //辅助指针，用来遍历链表
        HeroNode temp = head;
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
    }

    /**
     * 按照排名向链表插入节点
     * @param heroNode
     * 按照排名插入到链表中的思路
     * 1.找到需要添加的位置
     * 2.判断是否已经存在
     */
    public void add2(HeroNode heroNode){
        //定义一个辅助指针
        HeroNode temp = head;
        //判断是否已经存在
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            //指针所指的下一个编号大于待插入的编号
            if (temp.next.no > heroNode.no) {
                break;
                //指针下一个编号的等于待插入的编号，说明待插入的编号已经存在
            } else if (temp.next.no == heroNode.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
            //根据flag的值判断是否找到
            if (flag){
                System.out.printf("准备插入的编号 %d 已经存在，不能加入\n",heroNode.no);
            }else {
                //插入到链表中，temp的后面
                heroNode.next = temp.next;
                temp.next = heroNode;
            }
        }



    /**
     * 修改节点的信息
     * @param newHeroNode
     * 根据no编号修改
     * 1.根据no找到要修改的节点，进行修改
     */
    public void update(HeroNode newHeroNode){
        //保证不为空
        if (head.next == null){
            System.out.println("当前链表是空的");
            return;
        }
        //定义一个辅助指针
        HeroNode temp = head.next;
        //定义一个布尔值表示是否找到该节点
        boolean flag = false;
        //查找该节点
        while (true){
            if (temp == null){
                break;
            }
            //编号是否相等
            if (temp.no == newHeroNode.no){
                flag = true;
                break;
            }
            //通过flag的值判断是否找到要修改的节点
            if (flag){
                temp.name = newHeroNode.name;
                temp.nickname =  newHeroNode.nickname;
            }else {
                System.out.printf("没有找到编号为%d的节点",newHeroNode.no);
            }
        }




    }

    /**
     * 根据no编号删除节点
     * @param no
     * 1.根据no编号查找到要删除的节点的前一个节点
     * 2.修改前一个节点的下一个节点指向的值
     */
    public void del(int no){
        HeroNode temp = head;
        boolean flag = false;
        //遍历链表
        while (true){
            //判断是否到链表的最后
            if (temp.next == null){
                break;
            }
            if (temp.next.no == no){
                //temp.next = temp.next.next;
                flag = true;
                break;
            }
            temp = temp.next;

            if (flag){
                temp.next = temp.next.next;
            }else {
                System.out.printf("要删除的节点 %d 不存在",no);
            }
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
        HeroNode temp = head.next;
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
