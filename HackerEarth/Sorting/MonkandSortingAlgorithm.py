n = int(input())
arr = list(map(int, input().split()))
max_arr = max(arr)
multiplier = 1
radix = 10**5

while max_arr:
    arr.sort(key = lambda x : (x//multiplier)%radix)
    print(''.join(map(str,arr)))
    mul *= radix
    max_arr //= radix