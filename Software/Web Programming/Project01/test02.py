# Chapter 3

def getadditionalworkhour(work_hour):
    if work_hour >= 40:
        return float(work_hour + (workHour - 40) * 1.5)
    else:
        return work_hour

print "Exercise 3.1"
workHour = float(input("Enter hours : "))
workRate = float(input("Enter rate : "))
pay = getadditionalworkhour(workHour) * workRate

print "Pay : " + str(pay)

print "Exercise 3.2"
try:
    workRate = input("Enter rates : ")
except:
    print "Error, you are a retard, please enter numeric input"
    workRate = input("Enter rates : ")
try:
    workHour = input("Enter hours : ")
except: 
    print "Error, you are a retard, please enter numeric input"
    workHour = input("Enter hours : ")
pay = workHour * workRate
print "Pay : " + pay

print "Exercise 3.3"

print "Score  |  Grade"
print ">= 0.9      A"
print ">= 0.8      B"
print ">= 0.7      C"
print ">= 0.6      D"
print "<  0.6      E"

try:
    score = input("Enter score : ")
    if score >= 0.9:
        print "A"
    elif score >= 0.8:
        print "B"
    elif score >= 0.7:
        print "C"
    elif score >= 0.6:
        print "D"
    else:
        print "E"
except:
    print "Bad score"
