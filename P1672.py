gene = [
  ['A', 'C', 'A', 'G'],
  ['C', 'G', 'T', 'A'],
  ['A', 'T', 'C', 'G'],
  ['G', 'A', 'G', 'T']
]

n = int(input())
seq = list(input())

idx = 'AGCT'
while len(seq) > 1:
  # 표에서 해당 염기 찾기
  row, col = seq[-2], seq[-1]
  data = gene[idx.find(row)][idx.find(col)]

  # 마지막 두 개의 염기를 찾은 염기로 변경
  seq.pop(-1)
  seq.pop(-1)
  seq.append(data)

print(''.join(seq))