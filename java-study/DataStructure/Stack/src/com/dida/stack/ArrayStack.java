package com.dida.stack;

/**
 * @author 23216
 * @version 1.0
 * @description: 使用数组来模拟栈
 * @date 2022/1/31 16:04
 */
public class ArrayStack {
    /**
     * 栈的大小
     */
    private int maxSize;
    /**
     * 数组，用来模拟栈
     */
    private int[] stack;
    /**
     * 表示栈顶，初始化为-1
     */
    private int top = -1;

    public ArrayStack(int maxSize){
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }

    /**
     * 栈满
     * @return 栈顶为数组大小-1
     */
    public boolean isFull(){
        return top == maxSize -1;
    }

    /**
     * 栈空
     * @return 栈顶等于-1，就是刚初始化
     */
    public boolean isEmpty(){
        return top == -1;
    }

    /**
     * 入栈
     * @param value 传入值，将他添加到栈
     */
    public void push(int value){
        //判断栈是否满
        if (isFull()){
            System.out.println("栈满");
            return;
        }
        //将栈顶往上移一层
        top++;
        stack[top] = value;
    }

    /**
     * 出栈
     * 将栈顶的数据返回
     * @return 取出来栈顶的数据，将栈顶往下减一层，返回被取出的数据
     */
    public int pop(){
        //判断栈是否空
        if (isEmpty()){
            throw new RuntimeException("栈空，没有数据");
        }
       int value = stack[top];
        top--;
        return value;
    }

    /**
     * 遍历栈
     * 从栈顶开始显示数据
     */
    public void list(){
        if (isEmpty()){
            System.out.println("栈空，没有数据~~");
            return;
        }
        //需要从栈顶开始显示数据
        for (int i = top; i >= 0; i++) {
            System.out.printf("stack[%d]=%d\n",i,stack[i]);
        }
    }

}
