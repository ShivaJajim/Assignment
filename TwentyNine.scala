//29)Check for Non-Negative AND Not Divisible by 7:
//  Implement a Scala program to check if a given number is non-negative and not divisible by 7.
//Sample Data:
//  Number: 14
object TwentyNine{
 def main(args:Array[String]):Unit= {
   var a =13
   if(a>0 && a%7 !=0){
     print("given number is non-negative and not divisible by 7")
   }
   else {
     print("given number is negative and  divisible by 7")
   }
 }

}
