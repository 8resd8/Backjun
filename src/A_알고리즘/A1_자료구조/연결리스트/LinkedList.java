package A_알고리즘.A1_자료구조.연결리스트;


import java.util.HashSet;

public class LinkedList {
    Node head; // 리스트의 시작을 가리키는 포인터

    // 생성자
    public LinkedList() {
        this.head = null;
    }

    // 리스트의 끝에 요소 추가
    public void addLast(int data) {
        Node newNode = new Node(data);

        // 최초 생성시 첫 값이 헤드
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            // 최초 생성 시는 null 이후는 새로운 Node를 가리킨다.
            // 헤드를 기준으로 계속 찾기. tail의 next값은 null이기 때문
            while (current.next != null) {
                current = current.next; // 다음 다음 다음을 찾는다
            }
            current.next = newNode; // 마지막 노드에 새로운 노드를 저장한다.
        }
    }

    // 리스트의 모든 요소를 출력하는 메서드
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next; // 다음. 다음. 다음
        }

        System.out.println();
    }

    // 중복 요소를 제거하는 메서드
    public void removeDuplicates() {
        HashSet<Integer> set = new HashSet<>();
        Node current = head;
        Node prev = null; //

        while (current != null) {
            if (set.contains(current.data)) {
                prev.next = current.next; // 값이 이미 있다면 다음으로 건너 뛴다
            } else {
                set.add(current.data);
                prev = current;
            }
            current = current.next; // 다음으로 넘김
        }
    }

    // 앞에 요소에 추가
    public void addFirst() {
        Node current = head;


    }

    // 제거
    public void delete(int data) {
        Node current = head;
        Node previous = null;

        // 헤드가 제거 대상이면 헤드를 넘긴다.
        if (current != null && current.data == data) {
            head = current.next;
            return;
        }

        // 시작 이후 ~ 마지막 노드까지 탐색
        while (current != null && current.next != null) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            return;
        }

        previous.next = current.next;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.printList(); // 예상 출력: 1 1 2 3 4

    }
}
