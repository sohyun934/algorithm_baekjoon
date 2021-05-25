n, k, m = map(int, input().split())

people = [i for i in range(1, n+1)]
turn_right = True
target = 0

while len(people) > 0:
  if n > len(people) and (n - len(people)) % m == 0:
    turn_right = not turn_right
    
  if turn_right:
    target = (target + k - 1) % len(people)
  else:
    target = (target - k + len(people)) % len(people)

  print(people.pop(target))