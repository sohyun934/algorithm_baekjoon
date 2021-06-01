from itertools import combinations
import sys
input = sys.stdin.readline

n = int(input().rstrip())
m_nums = []

for i in range(n):
  m_num = 0

  for cards in combinations(map(int, input().rstrip().split()), 3):
    if m_num < sum(cards) % 10:
      m_num = sum(cards) % 10

  m_nums.append((i, m_num))

m_nums.sort(key=lambda x:(x[1], x[0]))
print(m_nums[-1][0] + 1)