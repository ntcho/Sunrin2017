# page 113
# written for python 2.7

import string

fname = raw_input('Enter the file name: ')
try:
    fhand = open(fname)
except:
    print 'File cannot be opened:', fname
    exit()
counts = dict()
for line in fhand:
    # this changes all character in the given string to the following argument
    line = line.translate(None, string.punctuation)
    line = line.lower()
    words = line.split()
    for word in words:
        if word not in counts:
            counts[word] = 1
        else:
            counts[word] += 1

for item in counts:
    print counts[item], item
