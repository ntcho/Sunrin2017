
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
            print i * j,
        print
    print


def problem13():
    print ("Problem 13 [User input add]")
    input_number = int(input("Enter number : "))
    input_continue = raw_input("Continue? (Yes / No) : ")
    output_sum = 0
    output_sum += input_number
    while input_continue != "no":
        input_number = int(input("Enter number : "))
        output_sum += input_number
        input_continue = raw_input("Continue? (Yes / No) : ")
    print ("Sum of numbers you entered is " + str(output_sum))


def problem14():
    print ("Problem 14 [Number guessing]")
    print ("Guess a number between 1 and 100")
    random_number = random.randrange(1, 100)
    output_guess_count = 0
    input_guess_number = int(input("Enter a number : "))
    while input_guess_number != random_number:
        output_guess_count += 1
        if input_guess_number > 0 & input_guess_number <= 100:
            if input_guess_number > random_number:
                print ("Go smaller!")
            elif input_guess_number < random_number:
                print ("Go bigger!")
        else :
            print ("Enter a number between 0 and 100")
        input_guess_number = int(input("Enter a number : "))
    print ("Congratulations! Your guess count was " + str(output_guess_count) + " times")


def problem15():
    print ("Problem 15 [Problem generating]")
    input_answer = 0
    random_number1 = 0
    random_number2 = 0
    random_answer = random_number1 + random_number2
    while input_answer == random_answer:
        random_number1 = random.randrange(1, 100)
        random_number2 = random.randrange(1, 100)
        random_answer = random_number1 + random_number2
        input_answer = int(input(str(random_number1) + " + " + str(random_number2) + " = "))
        if input_answer == random_answer:
            print ("Good job!")
        else:
            print ("Try again next time!")


def problem16():
    print ("Problem 16 [Advanced problem generating]")
    input_answer = 0
    input_again = "no"
    random_number1 = 1
    random_number2 = 1
    random_answer = 0
    output_problem_count = 0
    random_expression = random.randrange(1, 6)
    # 1 + 2 - 3 * 4 / 5 ** 6 %
    while input_answer == random_answer or output_problem_count == 0:
        random_number1 = random.randrange(1, 100)
        random_number2 = random.randrange(1, 100)

        # random expression
        random_expression = random.randrange(1, 6)

        # calculate the answer
        if random_expression == 1:
            random_answer = random_number1 + random_number2
        elif random_expression == 2:
            random_answer = random_number1 - random_number2
        elif random_expression == 3:
            random_number1 = random.randrange(1, 15)
            random_number2 = random.randrange(1, 15)
            random_answer = random_number1 * random_number2
        elif random_expression == 4:
            random_number2 = random.randrange(1, 12)
            random_number1 = random_number2 * random.randrange(1, 12)
            random_answer = random_number1 / random_number2
        elif random_expression == 5:
            random_number1 = random.randrange(1, 16)
            random_answer = random_number1 ** 2
        elif random_expression == 6:
            random_number2 = random.randrange(1, 5)
            random_answer = random_number1 % random_number2
        else:
            random_answer = random_number1 + random_number2

        # printing the expression
        if random_expression == 1:
            input_answer = int(input(str(random_number1) + " + " + str(random_number2) + " = "))
        elif random_expression == 2:
            input_answer = int(input(str(random_number1) + " - " + str(random_number2) + " = "))
        elif random_expression == 3:
            input_answer = int(input(str(random_number1) + " * " + str(random_number2) + " = "))
        elif random_expression == 4:
            input_answer = int(input(str(random_number1) + " / " + str(random_number2) + " = "))
        elif random_expression == 5:
            input_answer = int(input(str(random_number1) + " ^ 2 = "))
        elif random_expression == 6:
            input_answer = int(input(str(random_number1) + " % " + str(random_number2) + " = "))
        else:
            input_answer = int(input(str(random_number1) + " + " + str(random_number2) + " = "))

        output_problem_count += 1
        if input_answer == random_answer:
            print ("Good job!")
        else:
            print ("Try again next time! Your score was " + str(output_problem_count - 1))
            input_again = raw_input("Try again? (Yes / No) : ")
            if input_again == "no" or input_again == "No":
                input_answer = -100
            else:
                input_answer = random_answer


# problem1()
# problem2()
# problem3()
# problem4()
# problem5()
# problem6()
# problem7()
# problem8()
# problem9()
# problem10()
# problem11()
# problem12()
# problem13()
# problem14()
# problem15()
problem16()