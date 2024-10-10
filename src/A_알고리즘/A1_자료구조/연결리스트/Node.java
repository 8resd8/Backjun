package A_알고리즘.A1_자료구조.연결리스트;

public class Node {
    int data; // 데이터를 저장하는 변수
    Node next; // 다음 노드를 가리키는 포인터 역할

    // 생성자
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
