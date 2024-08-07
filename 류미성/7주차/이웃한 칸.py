# 프로그래머스 [PCCE 기출문제] 9번 / 이웃한 칸

def solution(board, h, w):
    # 보드의 크기
    n = len(board)
    m = len(board[0]) 

    color = board[h][w]

    # 이동할 방향
    dh = [0, 1, -1, 0]
    dw = [1, 0, 0, -1]

    # 인접한 칸이 같은 색인 경우
    count = 0

    # 방향 검사
    for i in range (4):
        h_check = h + dh[i]
        w_check = w + dw[i]

        # 보드의 경계에서 벗어나는지 체크
        if 0 <= h_check < n and 0 <= w_check < m:
            # 인접한 칸이 같은 색인 경우를 체크
            if board[h_check][w_check] == color:
                count += 1
    
    return count