class Solution:
    def helper(self,numBottles, numExchange) -> int:
        drank = numBottles
        empty = numBottles

        while empty >= numExchange:
            empty -= numExchange
            drank += 1
            empty +=1
            numExchange+=1
        
        return drank
    
def main():
    numBottles =  int(input())
    numExchange = int(input())
    solution = Solution()
    sol = solution.helper(numBottles, numExchange)
    print(sol)

if __name__ == "__main__":
    main()