package com.dida.queue;

import java.util.Scanner;

/**
 * @author 23216
 * @version 1.0
 * @description: 使用算法优化得出环形队列
 * @date 2022/1/28 21:51
 */
public class RingQueue {
    public static void main(String[] args) {

        //创建队列
        Queue2 queue = new Queue2(3);
        char key = ' ';
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("s(show)：显示队列");
            System.out.println("e(exit)：退出程序");
            System.out.println("a(add)：添加数据到队列");
            System.out.println("g(get)：从队列取出数据");
            System.out.println("h(head)：查看队列头的数据");
            key = scanner.next().charAt(0);
            switch (key){
                case 's':
                    queue.showQueue();
                    break;
                case 'a':
                    System.out.println("输出一个数");
                    int value = scanner.nextInt();
                    queue.addQueue(value);
                    break;
                case 'g':
                    try {
                        int res = queue.getQueue();
                        System.out.printf("取出的数据是%d\n",res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        int res = queue.headQueue();
                        System.out.printf("队列头的数据是%d\n",res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("程序退出");
    }
}
class Queue2{
    /**
     * 数组的最大容量
     */
    private int maxSize;
    /**
     * 指向队列的第一个元素
     * arr[front]就是队列的第一个元素
     */
    private int front;
    /**
     * rear指向队列的最后一个元素的后一个位置，希望空出一个空间来作为约定
     */
    private int rear;
    /**
     * 存放数据的数组
     */
    private int[] arr;

    public Queue2(int arrMaxSize){
        maxSize = arrMaxSize;
        arr = new int[maxSize];
    }

    /**
     * 判断队列是否满
     */
    public boolean isFull(){
        //算上留出的空间来取模，是否等于头元素
        return (rear + 1)% maxSize == front;
    }

    /**
     * 判断队列是否为空
     *判断头元素和尾元素是否指向同一个
     */
    public boolean isEmpty(){
        return rear==front;
    }
    /**
     * 添加数据到队列
     */
    public void addQueue(int n){
        if (isFull()){
            System.out.println("队列满，不能加入数据");
            return;
        }
        arr[rear] = n;

        rear = (rear +1 ) % maxSize;
    }

    /**
     * 获取队列的数据，出队列
     */
    public int getQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列空，不能取数据");
        }
        /*
        分析出front指向队列的第一个元素
        1.先把front对应的值保存到一个临时变量
        2.将front后移，考虑取模
        3.将临时保存的变量返回
         */
        int value = arr[front];
        front = (front +1 ) % maxSize;
        return value;
    }

    /**
     * 显示队列的所有数据
     */
    public void showQueue(){
        if (isEmpty()){
            System.out.println("队列是空的，没有数据");
            return;
        }

        for (int i = 0; i < front + size(); i++) {
            System.out.printf("arr[%d]=%d\n",i%maxSize,arr[i%maxSize]);
        }
    }
    /**
     * 求当前队列的有效数据的个数
     */
    public int size(){
        return (rear+maxSize-front)%maxSize;
    }

    /**
     * 显示队列的头数据
     */
    public int headQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列是空的，没有数据");
        }
        return arr[front];
    }
}