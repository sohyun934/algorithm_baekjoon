ml, mr, tl, tr = input().split()
m = [ml, mr]
t = [tl, tr]

game = ['P', 'S', 'R']
result = ""

if ml == mr:
  win = (game.index(ml) + 1) % 3
  lose = ((game.index(ml) - 1) + 3) % 3

  if t.count(game[win]) > 0:
    result = "TK"
  elif t.count(game[lose]) == 2:
    result = "MS"
  else:
    result = "?"
elif tl == tr:
  win = (game.index(tl) + 1) % 3
  lose = ((game.index(tl) - 1) + 3) % 3

  if m.count(game[win]) > 0:
    result = "MS"
  elif m.count(game[lose]) == 2:
    result = "TK"
  else:
    result = "?"
else: # 두 명 모두 패가 다른 경우
  result = "?"

print(result) 