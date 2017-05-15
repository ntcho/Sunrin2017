while True:
    try:
        input_filename = raw_input("Input filename to open : ")
        fhand = open(input_filename)
        break
    except:
        print "Filename not found in directory. Please check the filename and try again."
output_array = []
for line in fhand:
    word= line.rstrip().split()
    for element in word:
        if element in output_array:
            continue
        else:
            output_array.append(element)
print output_array
