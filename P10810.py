# n = 바구니 갯수
# m = 공을 넣는 횟수

n, m = map(int, input().split())

# 1 ~ n번까지의 공, n개의 바구니
baskets = [0] * n

for _ in range(m):
  # i ~ j 번 바구니에 k번 공을 넣는다.
  i, j, k = map(int, input().split())
  
  baskets[i-1 : j] = [k] * (j - i + 1)

print(' '.join(map(str, baskets)))