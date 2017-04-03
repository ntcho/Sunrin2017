
def problem1():
    print ("Problem 1 [Calculating seconds to minutes]")
    input_second = int(input("Enter second : "))
    output_minute = 0
    output_second = 0
    if input_second < 60:
        output_minute = 0
    else:
        output_minute = (input_second / 60)
    output_second = input_second % 60

    if output_minute > 0:
        if output_second == 0:
            print (str(output_minute) + " Minute ")
        else:
            print (str(output_minute) + " Minute " + str(output_second) + " Second")
    else:
        print (str(output_second) + " Second")
    print


def problem2():
    print ("Problem 2 [Fahrenheit to celsius]")
    input_degree = int(input("Enter fahrenheit degree : "))
    output_degree = float((input_degree - 32) / 1.8)
    print (str(input_degree) + "C = " + str(output_degree) + "F")
    print


def problem3():
    print ("Problem 3 [Calculating BMI]")
    input_weight = float(input("Enter weight (kg) : "))
    input_height = float(input("Enter height (m)  : "))
    output_bmi = float(input_weight / (input_height * input_height))
    print ("BMI " + str(output_bmi))
    print


def problem4():
    print ("Problem 4 [Vending machine]")
    input_money = int(input("Enter money : "))
    input_price = int(input("Enter price : "))
    output_charge = input_money - input_price
    output_500 = int(output_charge / 500)
    output_100 = int((output_charge - (output_500 * 500)) / 100)
    print ("Charge : " + str(output_charge))
    print ("500 won coins returned : " + str(output_500))
    print ("100 won coins returned : " + str(output_100))
    print


def problem5():
    print ("Problem 5 [Sum of integer decimal]")
    input_int = int(input("Enter integer : "))
    output_sum = 0
    index = 0
    while int(input_int / (10 ** index)) != 0:
        output_sum += int(input_int / (10 ** index)) % 10
        index += 1
    print ("Sum of each character : " + str(output_sum))
    print


def problem6():
    print ("Problem 6 [Distance between two spots]")
    input_x1 = float(input("Enter coordinate of x1 : "))
    input_y1 = float(input("Enter coordinate of y1 : "))
    input_x2 = float(input("Enter coordinate of x2 : "))
    input_y2 = float(input("Enter coordinate of y2 : "))
    output_distance = float((abs(input_x1 - input_x2) ** 2 + abs(input_y1 - input_y2) ** 2) ** 0.5)
    print ("Distance between (" + str(input_x1) + ", " + str(input_y1) + ") and (" + str(input_x2) + ", " + str(input_y2) + ") is " + str(output_distance))
    print


def problem7():
    print ("Problem 7 [User verification]")
    user_name = raw_input("Enter username : ")
    user_password = raw_input("Enter password : ")
    if user_name == "sunrin" and user_password == "123456":
        print "Welcome, sunrin."
    else:
        print "Username or password incorrect"
        problem7()
    print

import random


def problem8():
    print ("Problem 8 [Random problem generator]")
    output_random_1 = random.randrange(1, 100)
    output_random_2 = random.randrange(1, 100)
    output_problem = int(input(str(output_random_1) + " - " + str(output_random_2) + " = "))
    if output_problem == (output_random_1 - output_random_2):
        print "Right answer :D"
    else:
        print "Wrong answer :("


def problem9():
    print ("Problem 9 [Factorial calculation]")
    input_number = int(input("Enter a number to calculate factorial : "))
    output_factorial = 1
    for i in range(1, input_number):
        output_factorial *= i + 1
    print ("Factorial " + str(input_number) + " : " + str(output_factorial))
    print


def problem10():
    print ("Problem 10 [Repeated user verification]")
    user_name = raw_input("Enter username : ")
    while user_name != "sunrin":
        print "Username incorrect"
        user_name = raw_input("Enter username : ")
    print ("Welcome, " + str(user_name))
    print


def problem11():
    print ("Problem 11 [Sum to 10]")
    output_for = 0
    for i in range(1, 11):
        output_for += i
    print output_for
    index = 0
    output_while = 0
    while index <= 10:
        output_while += index
        index += 1
    print output_while
    print


def problem12():
    print ("Problem 12 [Multiply table]")
    for i in range(1, 10):
        for j in range(1, 10):
            print i*j,
        print
    print

problem1()
problem2()
problem3()
problem4()
problem5()
problem6()
problem7()
problem8()
problem9()
problem10()
problem11()
problem12()
