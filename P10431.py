import sys
input = sys.stdin.readline

p = int(input().rstrip())

for _ in range(p):
  children = list(map(int, input().rstrip().split()))
  num = children.pop(0)
  row = []
  cnt = 0

  for child in children:
    row.append(child)

    if child < max(row):
      row.sort()
      cnt += len(row) - (row.index(child) + 1)

  print(num, cnt)