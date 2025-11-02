import bisect
import sys
input = sys.stdin.readline

n = int(input())
distances = []
for _ in range(n):
    x, y = map(int, input().split())
    distances.append(x*x + y*y)

distances.sort()

q = int(input())
for _ in range(q):
    r = int(input().strip())
    r_squared = r*r
    count = bisect.bisect_right(distances, r_squared)
    print(count)
