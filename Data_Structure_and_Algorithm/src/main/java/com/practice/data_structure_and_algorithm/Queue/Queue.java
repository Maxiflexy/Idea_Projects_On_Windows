package com.practice.data_structure_and_algorithm.Queue;

import java.util.NoSuchElementException;

public class Queue {
    private ListNode front;
    private ListNode rear;
    private int length;
    public Queue(){
        this.front = null;
        this.rear = null;
        length = 0;
    }

    public class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public int getLength(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }

    public void enqueue(int data){
        ListNode temp = new ListNode(data);
        if(isEmpty())
            front = temp;
        else
            rear.next = temp;
        rear = temp;
        length++;
    }
    public int dequeue(){
        if(isEmpty())
            throw new NoSuchElementException();
        int result = front.data;
        front = front.next;
        if(front == null)
            rear = null;
        length--;
        return result;
    }

    public void display(){
        if(isEmpty()) return;
        ListNode current = front;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public int first(){
        if(isEmpty())
            throw new NoSuchElementException();
        return front.data;
    }
    public int last(){
        if(isEmpty())
            throw new NoSuchElementException();
        return rear.data;
    }
    


    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(9);
        queue.enqueue(12);
        queue.display();
//        int result = queue.dequeue();
//        queue.display();
//        System.out.println(result);

        System.out.println(queue.first());
        System.out.println(queue.last());








    }



}
