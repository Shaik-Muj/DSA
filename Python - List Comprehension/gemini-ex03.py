'''
Exercise 3: Squares of Even Numbers
Task: Given a list of numbers, create a new list that contains the square of each number, but only if the number is even.

Starting List: numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

Hint: The operator for squaring a number is **2.

Expected Output: [4, 16, 36, 64, 100]
'''

numbers = map(int, input().split())
res = [number**2 for number in numbers if number%2==0]
print(res)