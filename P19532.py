from math import gcd

a, b, c, d, e, f = map(int, input().split())

if a == 0:
  y = c // b
  x = (f - e*y) // d
elif d == 0:
  y = f // e
  x = (c - b*y) // a  
else:
  def lcm(x, y):
    return x * y // gcd(x, y)

  lcm_num = lcm(a, d)

  m_b = b * (lcm_num // a)
  m_c = c * (lcm_num // a)
  m_e = e * (lcm_num // d)
  m_f = f * (lcm_num // d)

  sub_num, sub_num2 = 0, 0

  if m_b > m_e:
    sub_num = m_b - m_e
    sub_num2 = m_c - m_f
  else:
    sub_num = m_e - m_b
    sub_num2 = m_f - m_c    

  y = sub_num2 // sub_num
  x = (c - b*y) // a

print(x, y, sep=" ")