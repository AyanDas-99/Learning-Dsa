class Queue {
    private int[] arr;
    private int head, tail, size;

    Queue(int N) {
        size = N;
        arr = new int[N];
        head = N;
        tail = N;
    }

    public int enqueue(int data) {
        if (!isFull()) {
            arr[--head] = data;
        } else System.out.println("stack overflow !! could not enqueue " + data);
        return data;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Stack underflow !!");
            return -1;
        }
        return arr[--tail];
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public boolean isFull() {
        return head == 0;
    }

    public int peek() {
        return arr[head];
    }

    public void display() {
        for (int i = head; i < tail; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class circularQueue {
    private int head, tail, size;
    private int[] arr;

    public circularQueue(int N) {
        size = N+1;
        head = 0;
        tail = 0;
        arr = new int[size];
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public boolean isFull() {
        if(head == size-1){
            return tail == 0;
        }
        return tail == head+1;
    }

    public int enqueue(int n) {
        if (!isFull()){
            if (head < size) arr[++head] = n;
            else {
                head = 0;
                arr[head] = n;
            }
            System.out.println("Enqueued "+n);
            return n;
        }
        else {
            System.out.println("Stack overflow !!");
            return -0;
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            if (tail < size) return arr[++tail];
            else {
                tail = 0;
                return arr[tail];
            }
        }
        System.out.println("stack underflow!!");
        return -0;
    }

    public int peekHead() {
        return arr[head];
    }

    public void display() {
        for (int element: arr) {
            System.out.print(element+" ");
        }
    }
}

public class queueArray {
    public static void main(String[] args) {
        circularQueue q = new circularQueue(5);
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        System.out.println("Enqueued "+q.enqueue(10));
        System.out.println("Enqueued "+q.enqueue(30));
        System.out.println("Enqueued "+q.enqueue(20));
        q.display();
        System.out.println("Dequeued "+q.dequeue());
        System.out.println("Dequeued "+q.dequeue());
        q.display();
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        System.out.println("Dequeued "+q.dequeue());
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        System.out.println("Enqueued "+q.enqueue(10));
        System.out.println("Enqueued "+q.enqueue(10));
        System.out.println("Enqueued "+q.enqueue(10));
        System.out.println("Enqueued "+q.enqueue(10));
        System.out.println("Enqueued "+q.enqueue(10));
        System.out.println(q.isFull());
    }
}

