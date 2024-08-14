package A1_자료구조.스택;

public class ArrayStack {
    private final int maxSize; // 스택 최대 크기
    private int top; // 스택의 제일 위
    private final int[] stackArray; // 데이터를 저장한 배열

    public ArrayStack(int size) {
        this.maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == (maxSize - 1);
    }


    public void push(int value) {
        if (isFull()) {
            System.out.print("더이상 채울 수 없어 ");
            return;
        }
        stackArray[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.print("더이상 뺄 수 없어 ");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.print("값이 없어 ");
            return -1;
        }
        return stackArray[top];
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        System.out.println("1 stack.peek() = " + stack.peek()); // 없어
        System.out.println("2 stack.pop() = " + stack.pop()); // 못빼
        System.out.println("3 stack.isEmpty() = " + stack.isEmpty());
        System.out.println("4 stack.isFull() = " + stack.isFull());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("stack.isFull() = " + stack.isFull());
    }
}
