//22)Check for Divisibility by 3 AND 5:
//  Write a Scala function to check if a given number is divisible by both 3 and 5.
//Sample Data:
//  Number: 15

object Twentytwo {
  def main(args:Array[String]):Unit={
    var a=15
    if(a%3 ==0 && a%5 ==0){
      print("given number is divisible by both 3 and 5")
    }
    else {
      print("given number is not divisible by both 3 and 5")
    }
  }

}