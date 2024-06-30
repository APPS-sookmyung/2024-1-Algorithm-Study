n = int(input())

target = []
out= []
stack = []
current_num = 1

for _ in range(n):
    target.append(int(input()))

for num in target:
    while current_num <= num:
        stack.append(current_num)
        out.append('+')
        current_num += 1
    if stack[-1] == num:
        stack.pop()
        out.append('-')
    else:
        print('NO')
        exit()

for k in out:
    print(k)