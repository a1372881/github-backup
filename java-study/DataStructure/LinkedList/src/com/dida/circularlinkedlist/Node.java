package com.dida.circularlinkedlist;

/**
 * @author 23216
 * @version 1.0
 * @description: 表示一个节点
 * @date 2022/1/31 13:16
 */
public class Node {
    private int no;
    private Node next;
    public Node(int no){
        this.no = no;
    }
    public int getNo(){
        return no;
    }
    public void setNo(int no){
        this.no = no;
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node next){
        this.next = next;
    }
}
