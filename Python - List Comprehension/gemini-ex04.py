'''
Exercise 4: 'Even' or 'Odd' Labels
Task: Create a list that labels the numbers from 1 to 10 as either "even" or "odd".

Hint: This requires a conditional expression (value_if_true if condition else value_if_false) inside the list comprehension.

Expected Output: ['odd', 'even', 'odd', 'even', 'odd', 'even', 'odd', 'even', 'odd', 'even']

'''

res =["even" if num%2==0 else "odd" for num in range(1,11)]
print(res)
