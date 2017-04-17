# Chapter 6
# Exercise 6.1


def problem1():
    print ("Problem 1 [Revert string]")
    input_string = raw_input("Input string : ")
    index = len(input_string) - 1
    output_string = ""
    while index >= 0:
        output_string += (input_string[index])
        index -= 1
    print output_string


def problem2():
    print ("Problem 2 [Get user id from email]")
    input_email = raw_input("Email : ")
    print (input_email[0:input_email.find('@')])


problem1()
problem2()