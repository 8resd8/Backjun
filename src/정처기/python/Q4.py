def fnCalculation(x,y):
    result = 0;
    for i in range(len(x)):
        temp = x[i:i+len(y)]
        if temp == y:
            result += 1;
    return result

a = "abdcabcabca"
p1 = "ab";
p2 = "ca";

out = f"ab{fnCalculation(a,p1)}ca{fnCalculation(a,p2)}"
print(out)

# 문자열 슬라이싱
# x[0:2] -> 0이상 2미만, ab, bd, ca ... ca
# ab와 일치 3개, ca일치 3개
# ab3ca3