package com.java.base.DataStructures.Queue;

import java.util.Scanner;

/**
 * @author panbin
 * @date 2021年12月05日11:31 上午
 */
public class CircleQueueDemo {

    public static void main(String[] args) {
        //测试数组环形队列
        CircleArrayQueue queue = new CircleArrayQueue(4); //实际队列长度最大只有3
        doLoop(queue);
    }

    //用于测试队列
    public static void doLoop(CircleArrayQueue queue) {
        char key; // 用于接收用户输入
        int res; //用于取出队列中的数据
        Scanner sc = new Scanner(System.in);
        boolean loop = true;    //判断是否需要继续执行

        // 提示信息
        System.out.println("s(show): 显示队列");
        System.out.println("e(exit): 退出队列");
        System.out.println("a(add): 添加数据到队列");
        System.out.println("g(get): 从队列取出数据");
        System.out.println("h(head): 查看队列头的数据");

        while (loop) {
            key = sc.next().charAt(0); //接收一个字符
            switch (key) {
                case 's':
                    queue.showQueue();
                    break;
                case 'a':
                    System.out.println("请输入一个数用于插入队列");
                    int varlue = sc.nextInt();
                    queue.addQueue(varlue);
                    break;
                case 'g':
                    try {
                        res = queue.getQueue();
                        System.out.printf("从队列取出的数据是%d\n", res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    res = queue.headQueue();
                    System.out.printf("队列头的数据是%d\n", res);
                    break;
                case 'e':
                    sc.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("程序运行结束");
    }

}
