def main():
    N = int(input())
    res = []
    
    for i in range(N):
        operation = input().split()
        
        if operation[0] == 'insert':
            idx = int(operation[1])
            value = int(operation[2])
            res.insert(idx, value)
            
        elif operation[0] == 'remove':
            value = int(operation[1])
            res.remove(value)
            
        elif operation[0] == 'append':
            value = int(operation[1])
            res.append(value)
        
        elif operation[0] == 'sort': 
            res.sort()
        
        elif operation[0] == 'print':
            print(res)
            
        elif operation[0] == 'pop':
            res.pop()
            
        elif operation[0] == 'reverse':
            res.reverse()

if __name__ == '__main__':
    main()

