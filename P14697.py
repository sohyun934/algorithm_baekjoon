a, b, c, n = map(int, input().split())

result = 0

for i in range(n//a+1):
  if result == 1: break

  for j in range(n//b+1):
    if result == 1: break

    for z in range(n//c+1):
      if a*i + b*j + c*z == n:
        result = 1
        break

print(result)