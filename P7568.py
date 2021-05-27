n = int(input())
people = []

for _ in range(n):
  w, h = map(int, input().split())
  people.append((w, h))

order = [1] * n

for i in range(n):
  for j in range(n):
    if people[i][0] < people[j][0] and people[i][1] < people[j][1]:
      order[i] += 1

print(" ".join(map(str, order)))