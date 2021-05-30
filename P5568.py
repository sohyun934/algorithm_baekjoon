from itertools import permutations

n = int(input())
k = int(input())

cards = [input() for _ in range(n)]
nums = set()

for p in permutations(cards, k):
  num = ""
  
  for i in range(k):
   num += p[i]

  nums.add(num)

print(len(nums))