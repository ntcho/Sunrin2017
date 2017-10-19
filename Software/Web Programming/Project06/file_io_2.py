fhand = open('input2.txt', 'w')
question = "There is a bomb, what you are gonna say? : "
write = raw_input(question)
fhand.write(str(question) + str(write) + " ")
fhand.close()
