package com.dida.circularlinkedlist;

/**
 * @author 23216
 * @version 1.0
 * @description: 创建一个链表来管理节点
 * @date 2022/1/31 13:15
 */
public class CircleLinkedList {

    private Node first = null;

    /**
     * 给链表 添加节点
     * @param nums 指定链表的节点个数
     */
    public void addNode(int nums){
        //对nums做数据校验
        if (nums < 1){
            System.out.println("num的值不正确");
            return;
        }
        Node curNode = null;
        for (int i = 0; i <= nums; i++) {
            Node node = new Node(i);
            if (i==1){
                first = node;
                first.setNext(first);
                //让curNode指向第一个节点
                curNode = first;
            }else {
                curNode.setNext(node);
                node.setNext(first);
                curNode = node;
            }
        }
    }


    /**
     * 遍历当前的环形链表
     */
    public void showNode(){
        //判断链表是否为空
        if (first == null){
            System.out.println("没有任何小孩~~");
            return;
        }
        //添加一个辅助指针
        Node curNode = first;
        while (true){
            System.out.printf("小孩的编号为 %d \n",curNode.getNo());
            //最后一个节点的下一个节点是头节点说明已经遍历完了
            if (curNode.getNext() == first){
                break;
            }
            //将curNode后移
            curNode = curNode.getNext();
        }
    }

    /**
     * 根据用户的输入，计算出节点出圈的顺序
     * @param startNo 表示从第几个节点开始数
     * @param contNum 表示数几下
     * @param nums 表示最初有多少节点
     */
    public void contNode(int startNo,int contNum,int nums){
        /**
         * 对传入的数据进行校验
         *1. 头节点不能空，
         *2. 不能从小于1的节点数，
         *3.最初节点数不能小于链表中的节点数
         */
        if (first == null || startNo < 1 || startNo > nums){
            System.out.println("参数输入有误，请重新输入");
            return;
        }
        //创建辅助指针
        Node helper = first;
        //遍历
        while (true){
            //如果下一个节点是头节点就返回
            if (helper.getNext() == first){
                break;
            }
            helper = helper.getNext();
        }
        //在获取节点编号前，先将first和helper移动k-1次
        for (int i = 0; i < startNo -1; i++) {
            first = first.getNext();
            helper = helper.getNext();
        }
        while (true){
            //说明圈中只有一个节点
            if (helper == first){
                break;
            }
            //将first和helper指针同时移动countNum -1
            for (int i = 0; i < contNum -1; i++) {
                first =  first.getNext();
                helper = helper.getNext();
            }
            System.out.printf("节点 %d 出圈\n",first.getNo());
            first = first.getNext();
            helper.setNext(first);
        }
        System.out.printf("最后留在链表中的节点是 %d\n",first.getNo());
    }
}
