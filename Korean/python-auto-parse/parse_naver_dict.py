# -*- coding: utf-8 -*-
import urllib.request

f_read = open("words.txt", "rt", encoding="utf-8")
f_write = open("words_meaning.txt", "wt", encoding="utf-8")

# naver dictionary request url, line 464 contains the meaning
# but its not formatted to lines rip
url = 'http://krdic.naver.com/search.nhn?query='

for line in f_read:
    url_get = urllib.request.urlopen(str(url) + str(line.encode('utf-8'))).read()
    string_start_index = url_get.find(bytes('<p>[명사]'.encode('utf-8')))
    print("string start index is " + str(string_start_index + 13))
    print("string end   index is " + str(url_get.find(bytes('</p>'.encode('utf-8')), string_start_index + 9)))
    print(url_get)
    if string_start_index > 0:
        meaning = url_get[string_start_index + 13:url_get.find(bytes('</p>'.encode('utf-8')), string_start_index + 9)]
        print(meaning)
        f_write.write(str(line) + ' : ' + str(str(meaning).encode('utf-8').decode('utf-8')) + '\n')
f_write.close()
