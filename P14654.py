n = int(input())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

win_a, win_b, result = 0, 0, 0

for i in range(n):
  if b[i] - a[i] == 1 or (a[i] == 3 and b[i] == 1):
    win_a = 0
    win_b += 1
  elif a[i] - b[i] == 1 or (b[i] == 3 and a[i] == 1):
    win_a += 1
    win_b = 0
  elif a[i] == b[i]:
    if win_a:
      win_a = 0
      win_b += 1
    else:
      win_b = 0
      win_a += 1
      
  result = max(result, win_a, win_b)      

print(result)