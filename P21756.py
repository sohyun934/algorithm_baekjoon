n = int(input())
numbers = [i for i in range(n+1)]

while len(numbers) > 2:
  n_numbers = [numbers[i] for i in range(len(numbers)) if i % 2 == 0]
  numbers.clear()
  numbers = n_numbers.copy()

print(numbers[-1])