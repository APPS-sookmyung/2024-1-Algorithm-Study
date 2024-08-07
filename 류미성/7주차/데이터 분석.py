# 프로그래머스 [PCCE 기출문제] 10번 / 데이터 분석

def solution(data, ext, val_ext, sort_by):
    answer = []
    
    # 조건에 맞는 데이터만 추가
    for i in range(len(data)):
        if ext == 'code' and data[i][0] < val_ext:
            answer.append(data[i])
            
        elif ext == 'date' and data[i][1] < val_ext:
            answer.append (data[i])
            
        elif ext == 'maximum' and data[i][2] < val_ext:
            answer.append (data[i])
            
        elif ext == 'remain' and data[i][3] < val_ext:
            answer.append (data[i])
    
    # 정렬 기준에 따라 데이터 정렬
    if sort_by == 'code':
        answer.sort(key=lambda x:x[0])
        
    elif sort_by == 'date':   
        answer.sort(key=lambda x:x[1]) 
        
    elif sort_by == 'maximum':    
        answer.sort(key=lambda x:x[2])
                    
    elif sort_by == 'remain':    
        answer.sort(key=lambda x:x[3])
    
    
    return answer