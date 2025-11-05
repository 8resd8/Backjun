#include

int main() {
    char* p = "KOREA";
    printf("%s\n", p);
    printf("%s\n", p+1);
    printf("%c\n", *p);
    printf("%c\n", *(p+3));
    printf("%c\n", *p+4);
}


/**
포인터 문제
p = KOREA
p+1 = [1]번째부터 시작, OREA
*p = p[0]
*(p + 3) = p[3]
*p = K, + 4, K + 4 = O
*/