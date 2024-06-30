//10)Check for Non-Negative OR Even Number:
//  Create a Scala program to check if a given number is either non-negative or even.
//  Sample Data:
//  Number: -8

object Tenth {
  def main(args:Array[String]):Unit={
    var a= -8
    if(a> 0 || a%2==0)
      {
        print("given number is either non-negative or even.")
      }
    else {
      print("given number is not either non-negative or even.")
    }
  }

}
