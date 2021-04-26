r, b = map(int, input().split())
lw = r + b
l_w = (r + 4) // 2

for l in range(3, l_w):
  w = l_w - l
  
  if l * w == lw:
    if w > l: l, w = w, l
    
    print(l, w)
    break