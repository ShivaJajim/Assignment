"""11)Check for Prime AND Odd Number:
Write a Scala function to check if a given number is both a prime number and an odd number.
Sample Data:
Number: 17"""

a=17
count=0
for i in range(1,a+1):
    if(a%i==0):
        count=count+1

if ( count==2 and a%2==1):
    print("Given number is both a prime number and an odd number.")
else:
    print("Given number is not a prime number and an odd number.")