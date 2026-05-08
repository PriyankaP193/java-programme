n = int(input())

# Input matrix
arr = []

for i in range(n):
    row = list(map(int, input().split()))
    arr.append(row)

# Transpose matrix
for i in range(n):
    for j in range(i, n):
        arr[i][j], arr[j][i] = arr[j][i], arr[i][j]

# Reverse each row
for i in range(n):
    left = 0
    right = n - 1

    while left < right:
        arr[i][left], arr[i][right] = arr[i][right], arr[i][left]
        left += 1
        right -= 1

# Print rotated matrix
for i in range(n):
    for j in range(n):
        print(arr[i][j], end=" ")
    print()