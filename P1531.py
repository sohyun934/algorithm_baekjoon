n, m = map(int, input().split())
paint = [[0] * 100 for _ in range(100)]

for _ in range(n):
  x, y, x_end, y_end = map(int, input().split())
  
  for i in range(x, x_end+1):
    for j in range(y, y_end+1):
      paint[i-1][j-1] += 1

cnt = 0
for i in range(100):
  for j in range(100):
    if paint[i][j] > m:
      cnt += 1
print(cnt)