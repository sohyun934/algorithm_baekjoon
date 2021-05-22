n = int(input())
votes = [int(input()) for _ in range(n)]

cnt = 0

while max(votes) != votes[0] or votes.count(votes[0]) > 1:
  cnt += 1
  votes[votes.index(max(votes), 1)] -= 1
  votes[0] += 1

print(cnt)  