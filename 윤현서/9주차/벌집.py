n = int(input())
distance = 1
cnt = 1

while n > distance:
    distance += 6 * cnt
    cnt += 1
    
print(cnt)
