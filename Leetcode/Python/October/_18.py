class Solution:
    def helper(self, nums, k) -> int:
        nums = sorted(nums)
        hs = set()
        res = [0] * len(nums)

        for i in range(len(nums)):
            ele = nums[i]-k if i==0 else max(res[i-1]+1, nums[i]-k)

            if ele > nums[i]+k:
                ele = nums[i]+k

            hs.add(ele)
            res[i] = ele

        return len(hs)
    
def main():
    nums = list(map(int, input().split()))
    k = int(input())
    print(Solution().helper(nums,k))
    
if __name__ == "__main__":
    main()