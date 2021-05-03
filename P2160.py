import sys
input = sys.stdin.readline

n = int(input())
paintings = [[list(input().rstrip()) for _ in range(5)] for _ in range(n)]
one, two = 0, 0
m_cnt = 35

for i in range(n-1):
  for j in range(i+1, n):
    cnt = 0

    for k in range(5):
      for l in range(7):
        if paintings[i][k][l] != paintings[j][k][l]:
          cnt += 1

    if m_cnt > cnt:
      one, two = i+1, j+1
      m_cnt = cnt

print(one, two, sep=" ")