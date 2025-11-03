#include <stdio.h>

int func(){
 static int x =0;
  x+=2;
  return x;
}

int main(){
  int x = 1;
  int sum=0;
  for(int i=0;i<4;i++) {
    x++;
    sum+=func();
  }
  printf("%d", sum);

  return 0;
}

/**
C언어에서는 x가 1번만 초기화, 이후 실행안됨.
x값 누적
i = 0, x = 2
i = 1, x = 4
i = 2, x = 6
i = 3, x = 8
sum = 20

*/