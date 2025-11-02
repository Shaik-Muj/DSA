def max_special_integer(N, X, A) -> int:
    def is_valid(k):
        window_sum = sum(A[:k])
        if window_sum > X:
            return False
        for i in range(k, N):
            window_sum += X[i] - X[i-k]
            if window_sum > X:
                return False
        return True
    
    low, high = 1, N
    ans = 0
    while low <= high:
        mid = (low + high) // 2
        if is_valid(mid):
            ans = mid
            low = mid + 1
        else:
            high = mid - 1
    return ans

N, X =  map(int, input().split())
A = list(map(int, input().split()))

print(max_special_integer(N, X, A))