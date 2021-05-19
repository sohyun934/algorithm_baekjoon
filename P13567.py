import sys
input = sys.stdin.readline
M, n = map(int, input().rstrip().split())

di = 2
dx = [-1, 0, +1, 0]
dy = [0, +1, 0, -1]

invalid = False
x, y = 0, 0
nx, ny = 0, 0

for _ in range(n):
  command, d = input().rstrip().split()

  if command == "TURN":
    if d == "0":
      di -= 1
      if di == -1: di = 3
    else:
      di += 1
      if di == 4: di = 0
  elif command == "MOVE":
    nx += dx[di] * int(d)
    ny += dy[di] * int(d)

    if nx > M or ny > M or nx < 0 or ny < 0:
      invalid = True
      break
    else:
      x, y = nx, ny     

if invalid == True:
  print(-1)
else:
  print(x, y)