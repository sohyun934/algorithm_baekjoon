x, y, p1, p2 = map(int, input().split())

point = 0
cnt = 0
check_point1 = set()
check_point2 = set()

while True:
  check_point1.add(p1)
  check_point2.add(p2)

  p1 += x
  p2 += y

  if len(check_point1 & check_point2) >= 1:
    point = min(check_point1 & check_point2)
    break
  elif cnt > 1000:
    point = -1
    break

  cnt += 1  

print(point)
print(cnt)