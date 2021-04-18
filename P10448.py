test_case = int(input())

t = [n*(n+1)//2 for n in range(1, 46)]
eureka = [0] * 1001

for i in t:
  for j in t:
    for z in t:
      if i+j+z <= 1000:
        eureka[i+j+z] = 1

for _ in range(test_case):
  k = int(input())
  print(eureka[k])