from itertools import combinations

t = int(input())
for _ in range(t):
  n, m = map(int, input().split())
  cnt = 0

  for a, b in combinations(range(1, n), 2):
    if (a ** 2 + b ** 2 + m) % (a * b) == 0:
      cnt += 1

  print(cnt)