//14)Check for Non-Positive AND Even Number:
//  Implement a Scala program to check if a given number is both non-positive and even.
//  Sample Data:
//  Number: -6

object Fourteenth {
  def main(args:Array[String]):Unit={
    var n = -6
    if(n<0 && n%2==0)
      {
        print("given number is both non-positive and even")
      }
    else {
      print("given number is not a non-positive and even")
    }
  }

}
