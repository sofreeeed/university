import math

f= open("D:/laba.txt")
a=''
for i in f:
    a+=i
a=a.split("\n")
count=0
fn=[]
fi=[]
for i in range(len(a)-1):
    if count<6:
        fn.append(float(a[i]))
        count+=1
    else:
        fi.append(float(a[i]))
print(fn, fi)

for i in range(len(fi)):
    print(2*math.pi*fn[i]*1.33)