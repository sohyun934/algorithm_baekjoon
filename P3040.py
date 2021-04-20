nums = [int(input()) for _ in range(9)]
n_sum = sum(nums)
target = n_sum - 100

for i in nums:
  for j in nums:
    if i != j and i+j == target:
      nums.remove(i)
      nums.remove(j)

for n in nums:
  print(n)