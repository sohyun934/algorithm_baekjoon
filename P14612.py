n, m = map(int, input().split())
posts = []

for _ in range(n):
  c = input().split()

  if c[0] == "order":
    posts.append([int(c[2]), int(c[1])])
  elif c[0] == "sort":
    posts.sort()
  elif c[0] == "complete":
    for post in posts:
      if post[1] == int(c[1]):
        posts.pop(posts.index(post))
        break

  if len(posts) == 0:
    print("sleep")
  else:  
    for post in posts:
      print(post[1], end=" ")
    print()