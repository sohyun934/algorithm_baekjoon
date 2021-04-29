n = int(input())
trophies = [int(input()) for _ in range(n)]

left = trophies[0]
right = trophies[-1]

left_cnt = 1
right_cnt = 1

for i in range(1, len(trophies)):
  if left < trophies[i] and max(trophies[0:i]) < trophies[i]:
    left_cnt += 1

trophies.reverse()

for i in range(1, len(trophies)):
  if right < trophies[i] and max(trophies[0:i]) < trophies[i]:
    right_cnt += 1

print(left_cnt)
print(right_cnt)