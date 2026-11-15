import math

f= open("labatask2.txt")

a=''
for i in f:
    a+=i
a=list(map(float, a.split("\n")))
count=0
fn=[]
fi=[]
for i in range(len(a)):
    if count<9:
        fn.append(a[i])
        count+=1
    else:
        fi.append(a[i])
print(fn, fi)

for i in range(9):
    print(360*fi[i]*fn[i])
print()

for i in range(len(fi)):
    print(fn[i]*1000/fi[i])
print()
print(1000000/(2*math.pi*math.sqrt((1.33)*(56))))