a=list(map(int, input().split()))
first=[]
second=[]
third=[]
a.sort(reverse=True)
for i in range(len(a)):
    q = min(sum(first),sum(second),sum(third))
    if sum(first)==q:
        first.append(a[i])
    elif sum(second)==q:
            second.append(a[i])
    else:
            third.append(a[i])
print(max(sum(first),sum(second),sum(third))-min(sum(first),sum(second),sum(third)))