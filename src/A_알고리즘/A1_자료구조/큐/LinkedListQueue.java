package A_알고리즘.A1_자료구조.큐;


public class LinkedListQueue {
    private Node front;
    private Node rear;

    public LinkedListQueue() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int item) {
        Node newNode = new Node(item);

        // 크기가 0인 경우 앞 뒤가 일치
        if (front == null) {
            front = rear = newNode;
            return;
        }

        // 새로운 노드를 맨 끝에 추가 (뒤로 넘기고 값 저장)
        rear.next = newNode;
        rear = newNode;
    }

    // 큐 맨 끝을 삭제
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("큐가 비었음.");
            return Integer.MIN_VALUE;
        }

        int item = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("큐가 비었음.");
            return Integer.MIN_VALUE;
        }

        return front.data;
    }

    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(123);
        queue.enqueue(456);
        queue.enqueue(789);
        queue.dequeue();
        System.out.println("queue = " + queue.peek());
        System.out.println("queue.isEmpty() = " + queue.isEmpty());

    }
}
