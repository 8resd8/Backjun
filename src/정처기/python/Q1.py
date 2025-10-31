lst = [1,2,3]
dst = {i : i* 2 for i in lst}
s = set(dst.values())
lst[0] = 99
dst[2]=7
s.add(99)
print(len(s & set(dst.values())))


# lst = [99, 2, 33]
# dst = {2, 4, 7}
# s = {2, 4, 99}
# AND 계산, 2, 4 -> 2개
