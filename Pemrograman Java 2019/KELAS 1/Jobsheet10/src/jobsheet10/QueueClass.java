/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

/**
 *
 * @author Rajendra Rakha
 */
public class QueueClass {

    int max, size, front, rear;
    int[] Q;

    public QueueClass(int n) {
        max = n;
        Create();
    }

    public void Create() {
        Q = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Front Elemen: " + Q[front]);
        } else {
            System.out.println("Queue is Empty");
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Rear Elemen: " + Q[rear]);
        } else {
            System.out.println("Queue is Empty");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(Q[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Number of Queue = " + size);
        }
    }

    public void Enqueue(int data) {
        if (IsFull()) {
            System.out.println("Queue is Full");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            
            Q[rear] = data;
            
            size++;
        }
    }

    public int Dequeue() {
        int data = 0;
        if (IsEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            
            data = Q[front];
            
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }
}
