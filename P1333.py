n, l, d = map(int, input().split())
album = [0] * (n*l + (n-1)*5)

start = 0
for _ in range(n):
  album[start:start+l] = [1] * l # l초 동안 듣기
  start = start+l+5 # 5초 뒤 재생

ring = 0
while ring < len(album):
  if album[ring] == 0:
    break
  else:
    ring += d

print(ring)