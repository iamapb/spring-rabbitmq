package com.java.base.DataStructures.Queue;

/**
 * @author panbin
 * @date 2021年12月05日11:31 上午
 */
class ArrayQueue {

    private int maxSize;

    private int front;
    private int rear;

    private int[] arr;


    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new int[maxSize];
        // 指向队列头部 指向队列头的第一个位置
        this.front = -1;
        this.rear = -1;
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public void addQueue(int n) {
        if (isFull()) {
            System.out.println("队列已经满了");
            return;
        }
        rear++;
        arr[rear] = n;
    }

    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("没有数据");
        }
        front++;
        return arr[front];
    }

    //显示队列的所有数据
    public void showQueue() {
        //为空判断
        if (isEmpty()) {
            System.out.println("队列空的，没有数据");
            return;
        }
        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n", i, arr[i]);
        }
    }

    //显示队列的头数据，不取出数据
    public int headQueue() {
        //为空判断
        if (isEmpty()) {
            throw new RuntimeException("队列空，不能取数据");
        }
        return arr[front + 1];
    }
}
