//20)Divisibility by 5 OR 9:
//  Write a Scala program to check if a given number is divisible by either 5 or 9.
//Sample Data:
//  Number: 45

object Twenty {
  def main(args:Array[String]):Unit={
    var a=45
    if(a%9 == 0 || a%5 ==0){
      print("Given number is divisible by either 5 or 9.")
    }
    else {
      print("Given number is not divisible by either 5 or 9.")
    }
  }

}
