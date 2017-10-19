fhand = open('mbox.txt')
fwrite = open('mbox-sorted.txt', 'w')
print ("File read")
email = []
for line in fhand:
    line = line.rstrip()
    #print (line)
    if line.startswith('From'):
        email.append(line.split(' ')[1])
email_count = []
email_name = []
for line in email:
    print line
    try:
        email_name.index(line)
        email_count[email_name.index(line)] += 1
    except ValueError:
        email_name.append(line)
        email_count.append(1)
index = 0
for line in email_name:
    # TODO wth logic
    fwrite.write(str(email_count[index] / 2) + " times by " + str(email_name[index]) + '\n')
    index += 1
fwrite.close()
