#27)Check for Odd OR Prime Number:
#Write a Scala function to check if a given number is either odd or a prime number.
#Sample Data:
#Number: 11

a=11
num=0
for i in range(1, a+1):
    if(a%i == 0 ):
        num=num+1


if(num==2 or a%2==1):
    print("Prime Number or Odd number")
else:
    print("Not a Prime")