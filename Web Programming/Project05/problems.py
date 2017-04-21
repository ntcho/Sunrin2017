import random


def problem1():
    print ("Problem 1 [Random quotes]")
    quotes = [
        "Lorem ipsum dolor sit amet, consectetuer adipiscing elit.",
        "Sed ut perspiciatis unde omnis iste natus error sit voluptatem ",
        "Li Europan lingues es membres del sam familie.",
        "Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.",
        "The quick, brown fox jumps over a lazy dog."
                ]
    print random.choice(quotes)


def problem2():
    print ("Problem 2 [Sum of inputs]")
    output_sum = 0
    for i in range(0, 5):
        output_sum += float(input("Enter number : "))
    print output_sum


def problem3():
    print ("Problem 3 [Random calculations]")
    input_repeat_count = int(input("Enter repeat count : "))
    counters = [0,0,0,0,0,0]
    for i in range(0, input_repeat_count):
        counters[random.randrange(0, 6)] += 1
    for j in range(0, 6):
        print ("Dice " + str(j + 1) + " was shown " + str(counters[j]) + " times")


#problem1()
#problem2()
problem3()