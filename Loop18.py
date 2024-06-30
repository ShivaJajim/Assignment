#18)Check if a given number is a perfect square using a "while" loop.

n = 36
count=0
for i in range(1,n+1):
     if (n == (i*i)):
         count=count+1

if(count==1):
    print("Perfect Squre")
else:
    print("Not a perfect Squre")