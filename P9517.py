k = int(input())
n = int(input())

time = 0
for _ in range(n):
  t, z = input().split()
  time += int(t)

  if time > 210:
    print(k)
    break
  else:
    if z == "T":
      k += 1
      if k == 9: k = 1