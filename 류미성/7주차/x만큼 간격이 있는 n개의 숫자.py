# solution1
def solution(x, n):
    answer = []

    for i in range(n):
        answer.append(x * (i+1))

    return answer

# solution2
def solution1(x, n):
    return [i * x + x for i in range(n)]