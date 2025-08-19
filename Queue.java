import java.util.Scanner;

public class ArrayQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queue;

    public ArrayQueue(int size) {
        maxSize = size;
        queue = new int[maxSize];
        front = 0;
        rear = -1;
    }

    public void enqueue(int item) {
        if (rear == maxSize - 1) {
            System.out.println("Queue is full!");
            return;
        }
        queue[++rear] = item;
        System.out.println(item + " enqueued.");
    }

    public void dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println(queue[front++] + " dequeued.");
    }

    public void display() {
        if (front > rear) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue(5);
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int val = sc.nextInt();
                    q.enqueue(val);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
        sc.close();
    }
}
