
# chapter 5 verse 10

# Exercise 5.1
print("Exercise 5.1")

# get number inputs and calculate sum / count / average of input numbers

total_sum = 0
total_cnt = 0

while True:
    try:
        input_var = input("Enter a number : ")
        if input_var == "done":
            break
        else:
            input_var = float(input_var)
            total_sum += input_var
            total_cnt += 1
    except:
        print("Invalid input")

total_avg = float(total_sum / total_cnt)

print("Input completed")
print("Value sum = " + str(total_sum))
print("Value average = " + str(total_avg))
print("Value count = " + str(total_cnt))

# Exercise 5.2
print("Exercise 5.2")

# same as 5.1, but
# get number inputs and calculate maximum and minimum values

value_max = 0
value_min = 0

while True:
    try:
        input_var = input("Enter a number : ")
        if input_var == "done":
            break
        else:
            input_var = float(input_var)
            if input_var > value_max:
                value_max = input_var
            elif input_var < value_min:
                value_min = input_var
    except:
        print("Invalid input")

print("Input completed")
print("Maximum value = " + str(value_max))
print("Minimum value = " + str(value_min))
