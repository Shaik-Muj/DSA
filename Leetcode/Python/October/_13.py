class Solution:

    def isanagram(self, word1, word2):
        map1 = {}
        map2 = {}
        if len(word1) != len(word2) : return False

        for i in range(len(word1)):
            map1[word1[i]] = map1.get(word1[i],0)+1
            map2[word2[i]] = map2.get(word2[i],0)+1 
        
        return map1 == map2


    def remove_anagrams(self, words) -> list :
        res = list(words)
        for i in range(1,len(words)):
            if self.isanagram(words[i-1], words[i]):
                res.remove(words[i])

        return res

def main():
    words = list(input().split(" "))
    sol = Solution()
    res = sol.remove_anagrams(words)
    print(res)

if __name__ == "__main__":
    main()