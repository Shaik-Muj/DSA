class Solution :

    def isincreasing(self,arr, start, end) -> bool:
        for i in range(start, end):
            if arr[i] >= arr[i+1] :
                return False
            #start+=1
            
        return True
    

    def helper(self,arr, k) -> bool:
        n = len(arr)
        if n < 2*k :
            return False
        
        i=0
        while i + (2*k) <= n:
            if self.isincreasing(arr, i, i+k-1) and self.isincreasing(arr, i+k, i+(2*k)-1):
                return True
            i+=1
            
        return False
    
def main():
    arr = list(map(int, input().split()))
    k = int(input())
    sol = Solution()
    res = sol.helper(arr,k)
    print(res)

if __name__ == "__main__":
    main()