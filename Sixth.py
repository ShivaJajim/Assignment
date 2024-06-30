"""6)Multiple Range Check:
Write a Scala function to check if a given number is in the range [1, 10] or [20, 30].
Sample Data:
Number: 25"""

a=25
if (( a>=1 and a<=10) or ( a>=20 and a<=30)):
    print("Given number is in the range [1, 10] or [20, 30]")
else:
    print("Not in a range ")