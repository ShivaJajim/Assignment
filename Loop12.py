#12)Find the sum of all even numbers from 1 to 20 using a "while" loop.
sum=0
for i in range(1,21):
    if(i%2==0):
        sum=sum+i
print(sum)