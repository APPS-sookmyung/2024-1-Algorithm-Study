"""백준 문제 1927:
첫째 줄에 연산의 개수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 N개의 줄에는 연산에 대한 정보를 나타내는 정수 x가 주어진다.
만약 x가 자연수라면 배열에 x라는 값을 넣는(추가하는) 연산이고, x가 0이라면 배열에서 가장 작은 값을 출력하고 그 값을 배열에서 제거하는 경우이다.
x는 231보다 작은 자연수 또는 0이고, 음의 정수는 입력으로 주어지지 않는다.
출력
입력에서 0이 주어진 횟수만큼 답을 출력한다. 만약 배열이 비어 있는 경우인데 가장 작은 값을 출력하라고 한 경우에는 0을 출력하면 된다."""

import heapq
import sys
input=sys.stdin.readline
N=int(input())
q=[]
for _ in range(N):
    n=int(input())
    if n!=0:
        heapq.heappush(q,n)
    else:
        print(heapq.heappop(q) if q else 0)
        
