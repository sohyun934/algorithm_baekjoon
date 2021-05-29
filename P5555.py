word = input()
n = int(input())

rings = [input() for _ in range(n)]
cnt = 0

for ring in rings:
  ring += ring

  if word in ring:
    cnt += 1

print(cnt)