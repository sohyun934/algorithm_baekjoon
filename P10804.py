cards = []

for card in range(1, 21):
  cards.append(card)

selections = []

for _ in range(10):
  a, b = map(int, input().split())
  
  selections = cards[a-1:b]
  selections.reverse()

  cards[a-1:b] = selections

for card in cards:
  print(card, end=' ')