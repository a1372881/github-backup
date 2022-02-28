package com.dida.Singlylinkedlist;

/**
 * @author 23216
 * @version 1.0
 * @description: 创建节点
 * @date 2022/1/30 22:13
 */
public class HeroNode {
    /**
     * 节点编号
     */
    public int no;
    /**
     * 节点名
     */
    public String name;
    /**
     * 昵称
     */
    public String nickname;
    /**
     * 指向下一个节点
     */
    public HeroNode next;

    public HeroNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", "  +
                '}';
    }
}
