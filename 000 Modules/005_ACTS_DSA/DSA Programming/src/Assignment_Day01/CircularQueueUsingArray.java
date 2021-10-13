public class CircularQueueUsingArray implements QueueIntf {

    int rear;
    int front;
    int n;
    int[] circularQueue;

    public CircularQueueUsingArray(int n) {
        this.n = n;
        circularQueue = new int[n];
        rear = 0;
        front = 0;
    }

    @Override
    public void AddQ(int element) {
            rear=rear%n;
            circularQueue[rear] = element;
            ++rear;
    }

    @Override
    public int DeleteQ() {
        front=front%n;
        int element = circularQueue[front];
        front++;
        return element;
    }

    @Override
    public boolean IsEmpty() {
        if (rear == front) {
            return true;
        }
        return false;
    }

    @Override
    public boolean IsFull() {
        if ((rear + 1) % n == front) {
            return true;
        }
        return false;
    }

}
