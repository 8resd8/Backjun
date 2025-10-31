#include <stdio.h>
#define SIZE 3

typedef struct {
    int a[SIZE];
    int front;
    int rear;
} Queue;

void enq(Queue* q, int val){
    q->a[q->rear] = val;
    q->rear = (q->rear + 1) % SIZE;
}

int deq(Queue* q) {
    int val = q->a[q->front];
    q->front = (q->front + 1) % SIZE;
    return val;
}

int main() {
    Queue q = {{0}, 0, 0};

    enq(&q,1); enq(&q,2); deq(&q); enq(&q, 3);

    int first = deq(&q);
    int second = deq(&q);
    printf("%d 그리고 %d", first, second);

    return 0;
}

/**
원형 Queue

첫번째 deq(&q)
1 2 3
↑
값 삭제는 X, front 위치만 이동

int first = deq(&q);
1 2 3
  ↑
first = 2

int second = deq(&q);
1 2 3
    ↑
second = 3
*/