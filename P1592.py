n, m, l = map(int, input().split())
people = [0] * n

target = 0
people[target] += 1
cnt = 0

while people[target] < m:
  if people[target] % 2 != 0:
    target = (target + n - l) % n 
  elif people[target] % 2 == 0:
    target = (target + l) % n

  cnt += 1
  people[target] += 1

print(cnt)