class Solution:
    def isTrue(self, arr, k, inc) -> bool:
        n = len(arr)
        for i in range(k-1, n-k):
            if inc[i] >= k and inc[i+k] >= k:
                return True
        return False

    def helper(self, arr) -> int:
        n = len(arr)
        inc = [1] * n  
    
        for i in range(1, n):
            if arr[i] > arr[i-1]:
                inc[i] = inc[i-1] + 1
            else:
                inc[i] = 1  
        
        left, right = 1, n//2
        ans = 0
        
        while left <= right:
            mid = left + (right-left)//2
            if self.isTrue(arr, mid, inc):
                ans = mid
                left = mid + 1
            else:
                right = mid - 1
                
        return ans  

def main():
    arr = list(map(int, input().split()))
    sol = Solution()
    print(sol.helper(arr))

if __name__ == "__main__":
    main()