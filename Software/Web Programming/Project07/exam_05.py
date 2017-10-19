array = [-10.6, 0, 1, 18, 23.6, 45, 63, 86.1]

input_number = float(input("Enter number: "))
if array.index(input_number) >= 0:
    print str(input_number) + " is in room number " + str(array.index(input_number) + 1)
else:
    print str(input_number) + " is not in any of those rooms!"
