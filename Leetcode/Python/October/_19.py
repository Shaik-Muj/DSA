from collections import deque

class Solution:
    def findLexSmallestString(self, s: str, a: int, b: int) -> str:
        seen = set()
        smallest = s
        dq = deque([s])
        seen.add(s)

        while dq:
            cur = dq.popleft()
            if cur < smallest:
                smallest = cur

            # Add operation on odd indices
            chars = list(cur)
            for i in range(1, len(chars), 2):
                chars[i] = str((int(chars[i]) + a) % 10)
            added = ''.join(chars)
            if added not in seen:
                seen.add(added)
                dq.append(added)

            # Rotate operation
            rotated = cur[-b:] + cur[:-b]
            if rotated not in seen:
                seen.add(rotated)
                dq.append(rotated)

        return smallest

def main():
    s = input().strip()  # input string
    a = int(input())     # add operation value
    b = int(input())     # rotation value
    
    sol = Solution()
    result = sol.findLexSmallestString(s, a, b)
    print(result)

if __name__ == "__main__":
    main()
