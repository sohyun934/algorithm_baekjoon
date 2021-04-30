n = int(input())

words = [input() for _ in range(n)]
is_break = False

for word in words:
  if is_break == True: break
  
  for sec_word in words:
    if word == sec_word[::-1]:
      print(len(word), word[(len(word)-1) // 2], sep=" ")
      is_break = True

      break