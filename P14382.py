import sys
input = sys.stdin.readline

pivot = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}

t = int(input().rstrip())
for case in range(t):
  n = int(input().rstrip())
  numbers = set()
  i = 0

  while True:
    if n == 0:
      print("Case #{0}: {1}".format(case+1, "INSOMNIA"))
      break
    else:
      i += 1
      str_nums = str(n * i)
      
      for str_num in str_nums:
        numbers.add(int(str_num))

      if len(pivot - numbers) == 0:
        print("Case #{0}: {1}".format(case+1, str_nums))
        break