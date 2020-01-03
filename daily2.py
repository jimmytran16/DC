#Good morning! Here's your coding interview problem for today.
#This problem was asked by Uber.
#Given an array of integers, return a new array such that each element 
#at index i of the new array is the product of all the numbers in the 
#original array except the one at i.
#For example, if our input was [1, 2, 3, 4, 5], the expected output 
#would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected 
#output would be [2, 3, 6].

def checkIfEqual(arg1,arg2):
#function to check if the index matched each other
	if(arg1==arg2):
		return True
	return False

def translateToDict(arg):
	counter = 0
	dict = {}
	for i in list:	
		dict[counter] = i
		counter = counter +1
	return dict
	
def processList(l):
#init an empty list
#keep track of the index that we don't want to multiply as we are iterating through the list by using the range(from 0-> the length of the list)
#if same index of list to current index in range, then we will continue, else we multiply and keep a running product
#append product to newlist after we multiple all values excluding matching index value 	
#return the new list
	newlist = []
	for i in range(0,len(l)):
		keep_product = 1;
		for keys,values in l.items():
			if checkIfEqual(keys,i):
				continue
			else:
				keep_product = keep_product*values 
		newlist.append(keep_product)
	print(newlist)
			
			
#translating the list into a dictionary		
list = [1,2,3,4,5]
#list2 = [3,2,1] <-- fix!!
dict1 = translateToDict(list)
#dict2 = translateToDict(list2)

processList(dict1)
#processList(dict2)
	





