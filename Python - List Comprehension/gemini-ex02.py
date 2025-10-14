'''
Exercise 2: Uppercase Words
Task: Given the list of words below, create a new list containing the uppercase versions of only the words that have 4 or more characters.

Starting List: words = ['hello', 'world', 'a', 'is', 'python', 'fun']

Hint: You'll need a condition to check the length of each word (len()) and a method to convert the word to uppercase (.upper()).

Expected Output: ['HELLO', 'WORLD', 'PYTHON']
'''
words = input().split()
res = [word.upper() for word in words if len(word)>=4]
print(res)