import sys
input = sys.stdin.readline

while True:
  numbers = list(map(int, input().split()))

  if numbers[0] == -1 : 
    break
  else:
    numbers.remove(0)
    cnt = 0
    
    for number in numbers:
      if number * 2 in numbers:
        cnt += 1

    print(cnt)