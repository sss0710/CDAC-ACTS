public class LinearQueueUsingArray implements QueueIntf {

    int rear;
    int front;
    int n;
    int[] linearQueue;

    public LinearQueueUsingArray(int n) {
        this.n = n;
        linearQueue = new int[n];
        rear = -1;
        front = -1;
    }

    @Override
    public void AddQ(int element) {
        ++rear;
        linearQueue[rear] = element;
    }

    @Override
    public int DeleteQ() {
        front++;
        int element = linearQueue[front];
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
        if ((rear + 1) == n) {
            return true;
        }
        return false;
    }

}
