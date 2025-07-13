import java.util.Scanner;

class Queue {
    private int front, rear, capacity;
    private int[] queue;

    public Queue(int c) {
        front = 0;
        rear = -1;
        capacity = c;
        queue = new int[c];
    }

    public void queueEnqueue(int data) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full");
            return;
        }
        queue[++rear] = data;
    }

    public void queueDequeue() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < rear; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;
    }

    public void queueDisplay() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " <-- ");
        }
        System.out.println();
    }

    public void queueFront() {
        if (rear == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front Element is: " + queue[front]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the capacity of the queue: ");
        int capacity = sc.nextInt();
        Queue q = new Queue(capacity);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Front Element");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int data = sc.nextInt();
                    q.queueEnqueue(data);
                    break;
                case 2:
                    q.queueDequeue();
                    break;
                case 3:
                    q.queueDisplay();
                    break;
                case 4:
                    q.queueFront();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
