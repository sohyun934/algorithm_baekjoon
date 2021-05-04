from itertools import combinations
from math import gcd

numbers = map(int, input().split())
m_numbers = []

def lcm(l):
  a, b, c = l[0], l[1], l[2]

  tmp = a * b // gcd(a, b)
  return tmp * c // gcd(tmp, c)

for i in combinations(numbers, 3):
  m_numbers.append(lcm(i))

print(min(m_numbers))