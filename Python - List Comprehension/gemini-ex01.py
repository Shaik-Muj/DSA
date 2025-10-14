'''
Exercise 1: Finding Multiples
Task: Create a list of all numbers between 1 and 100 (inclusive) that are divisible by 8.

Hint: You can use the range() function to generate the numbers and the modulo operator (%) to check for divisibility.

Expected Output: [8, 16, 24, 32, 40, 48, 56, 64, 72, 80, 88, 96]
'''

res = [x for x in range(1,101) if x%8 == 0]
print(res)