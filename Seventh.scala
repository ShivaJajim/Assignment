//7)Check for Negative AND Odd Number:
//  Implement a Scala program to check if a given number is both negative and odd.
//Sample Data:
//  Number: -7

object Seventh {
  def main(args:Array[String]):Unit={
    var a = -7
    if( a<0 && a%2==1){
      print("Given number is both negative and odd")
    }
    else{
      print("Given number is not  negative and odd")
    }
  }

}
