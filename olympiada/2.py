h  = list(map(int, input().split()))

left, right = 0, len(h) - 1
left_max, right_max = 0, 0
square = 0

while left < right:
    if h[left] < h[right]:
        left_max = max(left_max, h[left])
        square += left_max
        left += 1
    else:
        right_max = max(right_max, h[right])
        square += right_max
        right -= 1

print(square * 5)
    