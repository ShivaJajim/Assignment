//31)Check for Divisibility by 4 OR 6:
//  Create a Scala function to check if a given number is divisible by either 4 or 6.
//Sample Data:
//  Number: 24

object Thirthyone {
  def main(args:Array[String]):Unit={
    var a=24
    if(a%4==0 || a%6==0){
      print("Given number is divisible by either 4 or 6")
    }
    else{
      print("Given number is not divisible by either 4 or 6")
    }

  }

}
