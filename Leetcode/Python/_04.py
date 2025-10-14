class Solution:
    def helper(self, height : list) -> int:
        left=0
        right=len(height)-1
        maxA = 0

        while left<=right :
            area = min(height[left], height[right]) * (right-left)

            maxA = max(maxA, area)

            if height[left] <= height[right]: left+=1
            else: right-=1
        
        return maxA
    
def main():
    n = int(input())
    height = list(map(int, input().split()))
    sol = Solution()
    res = sol.helper(height)
    print(res)

if __name__ == "__main__":
    main()