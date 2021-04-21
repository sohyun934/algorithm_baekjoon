heights = [int(input()) for _ in range(9)]
h_sum = sum(heights)

for i in heights:
  if len(heights) == 7: break
  
  for j in heights:
    if i != j and i+j == h_sum-100:
      heights.remove(i)
      heights.remove(j)
      break
      
heights.sort()
for h in heights:
  print(h)