//13)Divisibility by 3 OR 8:
//  Write a Scala function to check if a given number is divisible by either 3 or 8.
//Sample Data:
//  Number: 24

object Thirteenth {
  def main(args:Array[String]):Unit={
    var a=24
    if(a%3==0 || a%8==0)
      {
        print("given number is divisible by either 3 or 8")
      }
  }

}
