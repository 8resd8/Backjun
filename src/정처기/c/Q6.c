#include <stdio.h>


typedef struct{
    int accNum;
    double bal;
}BankAcc;



double sim_pow(double base, int year){
    int i;
    double r = 1.0;

    for(i=0; i<year; i++){
        r = r*base;
    }
    return r;
}



void initAcc(BankAcc *acc, int x, double y){
    acc -> accNum = x;
    acc -> bal = y;
}



void xxx(BankAcc *acc, double *en){
    if (*en > 0 && *en < acc -> bal) {
        acc -> bal = acc -> bal-*en;
    }else{
        acc -> bal = acc -> bal+*en;
    }
}



void yyy(BankAcc *acc){
    acc -> bal = acc -> bal * sim_pow((1+0.1),3);
}


int main(){

    BankAcc myAcc;
    initAcc(&myAcc, 9981, 2200.0);
    double amount = 100.0;
    xxx(&myAcc, &amount);
    yyy(&myAcc);
    printf("%d and %.2f", myAcc.accNum, myAcc.bal);
    return 0;

}

/*
BankAcc myAcc 값의 전달
myAcl -> addNum 값 변화 없음, 9981
xxx 함수의 if문 true
acc.bal = acc.bal - *en = 2200.0 - 100.0 = 2100

yyy 함수 실행
acc.bal = 2100 * 1.1 * 1.1 * 1.1 = 2795.1

출력
9981 and 2795.10
%.2f 주의, 2자리까지 표현해야 함.

*/