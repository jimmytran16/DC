#Good morning! Here's your coding interview problem for today.
#This problem was asked by Stripe.
#Given an integer n, return the length of the longest consecutive run of 1s in its binary representation.
#For example, given 156, you should return 3.

def getBinaryConsecs(i):
	COUNTER = 0
	NUM = "{0:b}".format(i)
	MAP = {
		"1":0
	}
	for x in NUM:
		if(x == '1'):
			COUNTER+= 1
			if(COUNTER > int(MAP.get("1"))):
				MAP ={"1":COUNTER}
		else:
			COUNTER = 0
	return MAP.get("1")

print(getBinaryConsecs(156))
print(getBinaryConsecs(1700))
print(getBinaryConsecs(222))

