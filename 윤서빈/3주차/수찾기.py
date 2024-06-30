import sys

N = int(sys.stdin.readline())
N_list = list(map(int, sys.stdin.readline().split()))
N_list.sort()

M = int(sys.stdin.readline())
M_list = list(map(int, sys.stdin.readline().split()))

for m in M_list:
    left = 0
    right = N-1

    while left <= right:
        mid = (left + right) // 2
        if m > N_list[mid]:
            left = mid + 1
        elif m < N_list[mid]:
            right = mid -1
        else:
            left = mid
            right = mid
            break
    if left == mid and right == mid:
        print(1)
    else:
        print(0)

# 1920 수 찾기
# time complexity를 줄일 수 있는 인덱스를 활용하여 이진 탐색을 구현함