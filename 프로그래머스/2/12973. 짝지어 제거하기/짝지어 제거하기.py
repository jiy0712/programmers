def solution(s):
    stack = []
    for char in s:
        if stack and stack[-1] == char:
            stack.pop()
        else:
            stack.append(char)
    return 1 if not stack else 0

print(solution("baabaa"))  
print(solution("cdcd"))    
