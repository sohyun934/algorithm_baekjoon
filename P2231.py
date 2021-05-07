n = int(input())
pivot = max(0, n-9*len(str(n)))
result = 0

for i in range(pivot, n):
  num = i + sum(map(int, str(i)))

  if num == n:
    result = i
    break

print(result)