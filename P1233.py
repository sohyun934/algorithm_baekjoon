s1, s2, s3 = map(int, input().split())

sums = [0] * 81

for i in range(1, s1+1):
  for j in range(1, s2+1):
    for z in range(1, s3+1):
      sums[i+j+z] += 1

print(sums.index(max(sums)))