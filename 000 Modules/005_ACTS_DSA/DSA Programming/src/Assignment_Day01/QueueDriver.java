import java.util.*;

public class QueueDriver {
    public static void myQueue(int[] elements, QueueIntf queue) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Exit");
            System.out.println("Enter choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (!queue.IsFull()) {
                        System.out.print("Enter an element to enqueue : ");
                        int element = sc.nextInt();
                        queue.AddQ(element);
                    } else
                        System.out.println("Queue full");
                        break;
                case 2:
                    if (!queue.IsEmpty()) {
                        int output = queue.DeleteQ();
                        System.out.print("Element Dequeued : " + output);
                        System.out.println();
                    } else
                        System.out.println("Queue empty");
                        break;
                case 3:
                    System.out.println("Good Bye!");
                    System.exit(0);
                    break;
            }
        } while (true);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter queue size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        LinearQueueUsingArray Obj1 = new LinearQueueUsingArray(size);
        CircularQueueUsingArray Obj2 = new CircularQueueUsingArray(size);
        System.out.println("Select Queue Type");
        System.out.println("1. Linear Queue");
        System.out.println("2. Circular Queue");
        int choice;
        System.out.println("Enter a choice : ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                myQueue(arr, Obj1);
                break;
            case 2:
                myQueue(arr, Obj2);
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}
