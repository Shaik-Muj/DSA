def helper(mat):
    count=0

    for i in range(len(mat)):
        for j in range(len(mat)):
            for p in range(i, len(mat)):
                for q in range(j, len(mat)):
                    if mat[i][j] > mat[p][q] : count+=1

    
    return count




t = int(input())
n = int(input())
for _ in range(t):
    mat=[[int(x) for x in input().split()] for i in range(n)]
    print(helper(mat))

