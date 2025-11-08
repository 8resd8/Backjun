int main() {

    struct Test test[3] = { {1, "AB"}, {2, "DC"}, {3, "ED"} };

    struct Test* p = test + 1;

    printf("%s", p->x + (p->i - 1));

    return 0;


}


/*
p->x는 문자열 DC의 시작 주소
p->i - 1 = 2 - 1 = 1
p->x + 1은 포인터 연산으로 문자열의 두 번째 문자
DC[0] = D, DC[1] = C
따라서 p->x + 1은 C
*/