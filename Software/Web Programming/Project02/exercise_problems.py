# chapter 4

# verse 7, exercise 4.2, 3
print "Exercise 4.2"


def print_lyrics():
    print "I'm a lumberjack, and I'm okay"
    print "I sleep all night and I work all day"


repeat_lyrics()
# return an error: "NameError: name 'repeat_lyrics' is not defined"


def repeat_lyrics():
    print_lyrics()
    print_lyrics()


repeat_lyrics()

# verse 14, exercise 4.6, 7
print "Exercise 4.6"


def computepay(work_hour, work_rate):
    if work_hour >= 40:
        return float(40 + ((work_hour - 40) * 1.5)) * work_rate
    else:
        return work_hour * work_rate


workHourInput = float(input("Enter hours : "))
workRateInput = float(input("Enter rate : "))
pay = computepay(workHourInput, workRateInput)

print "Pay : " + str(pay)

print "Exercise 4.7"


def computegrade(score):
    if score <= 1:
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
    else:
        print "Bad score"


print " Score |  Grade"
print ">= 0.9      A"
print ">= 0.8      B"
print ">= 0.7      C"
print ">= 0.6      D"
print "<  0.6      E"

scoreInput = 0
# doesn't work kek
while type(scoreInput) is int:
    try:
        scoreInput = input("Enter score : ")
    except:
        print "Bad score"
        scoreInput = input("Enter score : ")

computegrade(scoreInput)
