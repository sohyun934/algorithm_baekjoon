import sys
input = sys.stdin.readline

n, m = map(int, input().rstrip().split())
cost = [int(input().rstrip()) for _ in range(n)]

def solution():
  result = [0] * n

  for _ in range(m):
    pivot = int(input().rstrip())

    for i in range(len(cost)):
      if pivot >= cost[i]:
        result[i] += 1
        break

  return result.index(max(result)) + 1

print(solution())