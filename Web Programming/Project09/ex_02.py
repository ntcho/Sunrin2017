file_name = raw_input("Enter the file name : ")
book = open(file_name, 'r')
words_list = []


for line in book:
    words = line.split()
    for word in words:
        if word not in words_list:
            # not the list, add it
            words_list.append(word)

print words_list
