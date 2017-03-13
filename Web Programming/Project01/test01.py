print "verse 15, Exercise 2.2"
name = raw_input("Enter your name : ")

print "Hello " + name

print "verse 15, Exercise 2.3"
workHours = int(raw_input("Enter Hours : "))
workRate = float(raw_input("Enter Rate : "))
workPay = float(workHours * workRate)

print "Your pay is : " + str(workPay)
# could use round() function to round up to second place

print "verse 15, Exercise 2.4"
width = float(raw_input("Width : "))
height = float(raw_input("Height : "))

# data types for following values
check1 = width / 2
check2 = width / 2.0
check3 = height / 3
check4 = 1 + 2 * 5
print check1  # integer
print check2  # float
print check3  # integer
print check4  # integer

print "verse 15, Exercise 2.5"
celsius = float(raw_input("Enter celsius : "))
print celsius
fahrenheit = float(celsius * 9 / 5) + 32

print "Celsius temp in fahrenheit is " + str(fahrenheit)
