import sys 
input = sys.stdin.readline

n, m = map(int, input().rstrip().split())
dnas = [input().rstrip() for _ in range(n)]

s = ""
hd = 0

for i in range(m):
  word = ""
  for dna in dnas: word += dna[i]
  c = list(set(word))

  m_chr, m_cnt = c[0], word.count(c[0])

  for i in range(1, len(c)):
    if word.count(c[i]) > m_cnt:
      m_chr = c[i]
      m_cnt = word.count(c[i])
    elif word.count(c[i]) == m_cnt and ord(c[i]) < ord(m_chr):
      m_chr = c[i]

  s += m_chr
  hd += (n - m_cnt)

print(s)
print(hd)