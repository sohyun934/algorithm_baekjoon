import sys
from itertools import permutations
input = sys.stdin.readline

n = int(input().rstrip())
asks = [input().rstrip().split() for _ in range(n)]

t_cnt = 0

for n_num in permutations([str(i) for i in range(1, 10)], 3):
  cnt = 0

  for ask in asks:
    s, b = 0, 0
    for i in range(3):
      if ask[0][i] == n_num[i]:
        s += 1
      elif n_num.count(ask[0][i]) > 0:
        b += 1

    if int(ask[1]) == s and int(ask[2]) == b:
      cnt += 1
      if cnt == n:
        t_cnt += 1
    else:
      break

print(t_cnt)