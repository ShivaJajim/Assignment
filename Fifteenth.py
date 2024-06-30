#15)Age Group Classification with AND:
#Create a Scala program to classify a person's age group. Classify them as a child (less than 13),
#teenager (between 13 and 19), and an adult (20 and above) using both logical AND and OR.
#Sample Data:
#Age: 15

a =15
if(a<13):
    print(":child")
elif(a<13 or 19>a):
    print("teenager")
elif( a==20 and a<20):
    print("Adult")
else:
    print("None   ")
