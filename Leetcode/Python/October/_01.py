class Solution:
    def helper(self,numBottles, numExchange) -> int:
        drunk = numBottles
        empty = numBottles

        while empty >= numExchange:
            newBottles = empty//numExchange
            drunk += newBottles
            empty = (empty%numExchange) + newBottles
        
        return drunk

def main():
    solution = Solution()
    numBottles = int(input())
    numExchange = int(input())
    result = solution.helper(numBottles, numExchange)
    print(result)

if __name__ == "__main__":
    main()