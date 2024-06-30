//4)Divisibility by 4 OR 6:
//  Write a Scala program to check if a given number is divisible by either 4 or 6.
//Sample Data:
//  Number: 18
object Fourth{
  def main(args:Array[String]):Unit ={
    var a=24
   if(a%4==0 || a%6==0){
     print("Given number is divisible by either 4 or 6")

    }
   else {
     print("Given number is not  divisible by either 4 or 6")
   }

  }

}
