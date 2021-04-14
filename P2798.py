n, m = map(int, input().split())
cards = list(map(int, input().split()))
cards.sort()

max = 0
for i in range(n):
  for j in range(i+1, n):
    for z in range(j+1, n):
      sum = cards[i] + cards[j] + cards[z]

      if sum > m:
        break
      elif max < sum:
        max = cards[i] + cards[j] + cards[z]

print(max)