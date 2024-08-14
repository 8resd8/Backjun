package A1_자료구조.스택;


class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListStack {
    private Node top;

    public LinkedListStack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int item) {
        Node newNode = new Node(item);
        newNode.next = top; // 아예 새로운 노드를 가리키는 것
        top = newNode; // 스택 제일 위 이동
    }

    public int pop() {
        if (top == null) {
            System.out.println("뺄 수 없어 ");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    public int peek() {
        if (top == null) {
            System.out.println("값이 없어 ");
            return -1;
        }
        return top.data;
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.pop();
        System.out.println("1 stack.isEmpty() = " + stack.isEmpty());
        System.out.println("2 stack.peek() = " + stack.peek());
        stack.push(1);
        stack.push(2);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(1);
    }
}
