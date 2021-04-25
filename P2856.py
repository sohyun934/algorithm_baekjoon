mushrooms = [int(input()) for _ in range(10)]
score, pre_score = 0, 0

for mushroom in mushrooms:
  score += mushroom

  if score >= 100:
    if score > 100:
      pre_score = score - mushroom

      if score - 100 > 100 - pre_score:
        score = pre_score
    
    break

print(score)