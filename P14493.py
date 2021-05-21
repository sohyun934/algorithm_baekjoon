import sys
input = sys.stdin.readline

n = int(input().rstrip())
sec = 0

for i in range(n):
  a, b = map(int, input().rstrip().split())
  mod = sec % (a + b)

  if mod < b:
    sec += b - mod
  sec += 1

print(sec)