import sys

input=sys.stdin.readline
t = int(input().rstrip())

for _ in range(t):
  n, m = map(int, input().rstrip().split())
  x = int(''.join(input().rstrip().split()))
  y = int(''.join(input().rstrip().split()))
  
  circle = input().rstrip().split()
  cnt = 0

  for i in range(n):
    if i+m > len(circle):
      z = ''.join(circle[i:len(circle)] + circle[0:i+m-len(circle)])
    else:
      z = ''.join(circle[i:i+m])
    
    z = int(z)
    if x <= z and z <= y: cnt += 1

  print(cnt)