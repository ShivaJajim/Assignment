//9)Divisibility by 5 AND 7:
//  Write a Scala function to check if a given number is divisible by both 5 and 7.
//Sample Data:
//  Number: 35

object Ninth {
  def main(args:Array[String]):Unit={
    var a=35
    if (a %5 ==0 && a%7==0){
        print("given number is divisible by both 5 and 7.")
    }
    else {
      print("given number is not divisible by both 5 and 7.")
    }
  }

}
