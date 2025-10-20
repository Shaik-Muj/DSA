class Solution:
    def helper(self, operations) -> int:
        value = 0

        for i in operations:
            if '+' in i: value +=1
            elif '-' in i: value -= 1

        return value

def main():
    n = int(input())  # number of operations
    operations = []
    for _ in range(n):
        operations.append(input().strip())
    
    sol = Solution()
    result = sol.helper(operations)
    print(result)

if __name__ == "__main__":
    main()
