while True:
  words = "".join(input().split()).lower()

  if words == "#": 
    break
  else:
    word = words[0]
    print(word, words.count(word)-1)