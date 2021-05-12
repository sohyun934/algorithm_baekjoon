methods = list(input())
balls = ['small', 'none', 'none', 'big']

def mix(one, two):
  balls[one], balls[two] = balls[two], balls[one]

for method in methods:
  if method == "A":
    mix(0, 1)
  elif method == "B":
    mix(0, 2)
  elif method == "C":
    mix(0, 3)
  elif method == "D":
    mix(1, 2)
  elif method == "E":
    mix(1, 3)
  elif method == "F":
    mix(2, 3)

print(balls.index('small')+1)
print(balls.index('big')+1)