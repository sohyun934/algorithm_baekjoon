import sys
input = sys.stdin.readline

h,w = map(int, input().rstrip().split())
for i in range(h):
  joi_map = []
  isCloud = False
  c_time = -1

  for j in list(input().rstrip()):
    if j == "c":
      isCloud = True
      c_time = 0
    elif isCloud == True:
      c_time += 1

    joi_map.append(c_time)  

  print(*joi_map)