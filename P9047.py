import sys
input = sys.stdin.readline
t = int(input().rstrip())

for _ in range(t):
  pivot = input().rstrip()
  cnt = 0
  
  while pivot != "6174":
    cnt += 1
    largest_num = int("".join(sorted(pivot, reverse=True)))
    smallest_num = int("".join(sorted(pivot)))

    pivot = str(largest_num - smallest_num).zfill(4)

  print(cnt)