#Good morning! Here's your coding interview problem for today.
#This problem was asked by Microsoft.
#A number is considered perfect if its digits sum up to exactly 10.
#Given a positive integer n, return the n-th perfect number.
#For example, given 1, you should return 19. Given 2, you should return 28

#-----------------------
# class 'method' that contains the findPairToTen method
# iterates from range 1-10 and find out which number + arg 'n' will give 10
# appends the strings together 
# returns 0 if number is not between 1-9
class methods:
	def findPairToTen(self, n):
		for i in range(1,10):
			if i + n == 10:
				value = str(n)+str(i)
			elif not n<10:
				return 0
		return value
#init a instance of class 'method'
# ask for input, calls function and passes user input
m = methods()
number = input('Enter a number from 1 to 9: ')
number = int(number)
print(m.findPairToTen(number))