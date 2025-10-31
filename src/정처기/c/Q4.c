#include <stdio.h>
#include <stdlib.h>

struct node {
    char c;
    struct node* p;
};

struct node* func(char* s) {
    struct node* h = NULL, *n;

    while(*s) {
        n = malloc(sizeof(struct node));
        n->c = *s++;
        n->p = h;
        h = n;
    }

    return h;
}

int main() {
    struct node* n = func("BEST");

    while(n) {
        putchar(n->c);
        struct node* t = n;
        n = n->p;
        free(t);
    }

    return 0;
}

/*
처음 h는 null
1. B 처리
n = malloc(...);
n->c - B
n->p = h (null), n->p = null, B가 가리키는 node는 null
h = n (B)

2. E 처리
n->c = E
n->p = h, h는 앞에서 B였기 떄문에 E는 B를 가리킴
h = n (E)

현재상황: E -> B -> null

3. 반복..

T -> S -> E -> B -> null

처음부터 출력 putchar(n.c)
TSEB
*/