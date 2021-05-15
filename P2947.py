pieces = list(map(int, input().split()))

while pieces != sorted(pieces):
  for i in range(4):
      if pieces[i] > pieces[i+1]:
        pieces[i], pieces[i+1] = pieces[i+1], pieces[i]
        print(" ".join(map(str, pieces)))