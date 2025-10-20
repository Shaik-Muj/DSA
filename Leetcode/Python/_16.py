class Solution:
    def helper(self,nums, value) -> int:
        n = len(nums)
        remainders = {}

        for i in range(n):
            rem = ((nums[i]%value)+value)%value
            remainders[rem] = remainders.get(rem,0)+1

        x=0
        while True:
            rem = x%value
            if rem not in remainders :
                break
            else :
                count = remainders.get(rem)
                if count == 1:
                    remainders.pop(rem)
                else :
                    remainders[rem] = count - 1
             
                x += 1

        return x
    
def main():
    nums = list(map(int, input().split()))
    value = int(input())
    print(Solution().helper(nums,value))

if __name__ == "__main__":
    main()