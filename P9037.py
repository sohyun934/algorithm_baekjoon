import sys
input = sys.stdin.readline

def play(n, candies):
  result = [0] * n
  cnt = 0

  while True:
    for i in range(n):
      if candies[i] % 2 == 1: candies[i] += 1
        
    if candies.count(candies[0]) == n: break

    for i in range(n):
      left = i - 1
      if i == 0: left = n - 1
      
      result[i] = candies[i] // 2 + candies[left] // 2

    candies = result.copy()
    cnt += 1

  return cnt

t = int(input().rstrip())

for _ in range(t):
  n = int(input().rstrip())
  candies = list(map(int, input().rstrip().split()))
  
  print(play(n, candies))