import sys

n, m = map(int, sys.stdin.readline().rstrip().split())

board = []
dice = []

for _ in range(n):
  board.append(int(sys.stdin.readline().rstrip()))

horse = 0
cnt = 0

for i in range(m):
  dice.append(int(sys.stdin.readline().rstrip()))
  cnt += 1
  horse += dice[i]

  if horse >= n-1: 
    print(cnt)
    break
  else:
    horse += board[horse]

    if horse >= n-1:
      print(cnt)
      break