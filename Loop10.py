#10)Check if a number is prime using a "while" loop.

num =11
count=0
for i in range(1,num+1):
    if(num%i==0):
        count=count+1

if(count==2):
    print("GIven number is prime")
else:
    print("Give number is not a prime ")