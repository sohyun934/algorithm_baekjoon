a, b, c, x, y = map(int, input().split())

price = 0

if c * 2 < a + b:
  price += c * min(x, y) * 2

  if x > y:
    if a <= c * 2:
      price += (x - y) * a
    else:
      price += (x - y) * c * 2 
  elif x < y:
    if b <= c * 2:
      price += (y - x) * b  
    else:
      price += (y - x) * c * 2
else:
  price += x * a
  price += y * b

print(price) 