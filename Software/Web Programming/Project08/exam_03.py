# page 127 exercise 10.3
# written for python 2.7
# -*- coding: utf-8 -*-

file_name = raw_input("Enter the file name : ")
# file_name = 'huck.txt'
book = open(file_name, 'r')


def prepare_text(raw_book):
    book_lines = []
    all_letters = ''

    for line in raw_book:
        line = ''.join([char for char in line if char.isalpha()])
        line = line.lower()
        book_lines.append(line)

    all_letters = all_letters.join(book_lines)
    return all_letters

condensed_book = prepare_text(book)

letter_histogram = {}

for letter in condensed_book:
    letter_histogram[letter] = letter_histogram.get(letter, 0) + 1

results_list = []

for key in letter_histogram:
    results_list.append((letter_histogram[key], key))

print "Letter frequency results for:", file_name
for pair in sorted(results_list, reverse=True):
    print pair[1], pair[0]