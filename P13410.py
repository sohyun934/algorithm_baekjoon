n, k = map(int, input().split())

nums = []

for i in range(1, k+1):
  nk = str(n * i)
  nums.append(int(nk[::-1]))

print(max(nums))