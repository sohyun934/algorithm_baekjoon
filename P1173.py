N, m, M, T, R = map(int, input().split())

X = m
minute = 0

if X + T > M:
  print(-1)
else:
  while N > 0:
    if X + T <= M: # 운동
      X += T
      N -= 1
      minute += 1
    else: # 휴식
      X -= R
      minute += 1

      if X < m: X = m

  print(minute)