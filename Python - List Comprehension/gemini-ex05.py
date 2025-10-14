'''
Matrix Flattening
Task: "Flatten" the matrix below into a single list.

Starting List: matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

Hint: This is a perfect use case for a nested list comprehension, which involves two for clauses.

Expected Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]

'''

rows = int(input())
matrix = []

for _ in range(rows):
    row = list(map(int, input().split()))
    matrix.append(row)

res = [item for row in matrix for item in row]
print(res)
