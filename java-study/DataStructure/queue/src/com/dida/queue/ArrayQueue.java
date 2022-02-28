package com.dida.queue;

import java.util.Scanner;

/**
 * @author 23216
 * @version 1.0
 * @description: 用数组复刻队列
 * 问题：
 * 1.将存入的数据全部取出之后不能再此存放，达不到复用的目的
 * 改进：
 * 使用算法使这个算法达到环形的队列
 * @date 2022/1/28 19:45
 */
public class ArrayQueue {

    public static void main(String[] args) {
        //创建队列
        Queue queue = new Queue(3);
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
class Queue{
    /**
    表示数组的最大容量
     */
    private final int maxSize;
    /**
     * 表示队列头
     */
    private int front;
    /**
     * 表示队列尾
     */
    private int rear;
    /**
     * 用于存放数据，模拟队列
     */
    private int[] arr;


    /**
     * 创建队列
     */
    public Queue(int arrMaxSize){
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        //指向队列头部
        front = -1;
        //指向队列尾部
        rear = -1;
    }

    /**
      判断队列是否满
     */
    public boolean isFull(){
        return rear == maxSize -1;
    }

    /**
     * 判断队列是否为空
     */
    public boolean isEmpty(){
        return rear == front;
    }

    /**
     * 像队列添加数据
     */
    public void addQueue(int n){
        if (isFull()){
            System.out.println("队列满了");
            return;
        }

        rear++;
        arr[rear] = n;
    }
    /**
     * 获取队列的数据
     */
    public int getQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列空，不能取数据");
        }

        front++;
        return arr[front];
    }

    /**
     * 显示所有的数据
     */
    public void showQueue(){
        if (isEmpty()){
            System.out.println("队列是空的，没有数据");
            return;
        }
        //遍历数据
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }

    /**
     * 显示队列的头数据，不是取出
     */
    public int headQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列是空的，没有数据");
        }
        return arr[front +1];
    }
}
