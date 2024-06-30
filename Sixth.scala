//6)Multiple Range Check:
//  Write a Scala function to check if a given number is in the range [1, 10] or [20, 30].
//Sample Data:
//  Number: 25

object Sixth {
 def main(args:Array[String]):Unit= {
   var a=25
   if( (a>1 && a<10) || (a>20 && a<30))
     {
       print("Given number is in the range [1, 10] or [20, 30]")
     }
     else{
       print("Given number is not in the range [1, 10] or [20, 30]")
     }
 }

}
