data = [
    [3, 5, 2, 4, 1],
    [4, 5, 1],
    [4, 4, 1, 5, 4],
    [4, 5]
]

result = {}

for index, lis in enumerate(data):
    list_sum = sum(lis)
    list_len = len(lis)

    result[index] = (list_sum, list_len)

print(result)

# 덧셈 15 10 18 9
# 길이 5 3 5 2 (배열의 길이)
