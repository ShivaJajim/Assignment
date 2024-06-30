//24)Divisibility by 2 OR 3:
//  Write a Scala function to check if a given number is divisible by either 2 or 3.
//Sample Data:
//  Number: 9

object TwentyFourth {
  def main(args:Array[String]):Unit={
    var a=9
    if(a%2 == 2 || a%3==0){
      print("Given number is divisible by either 2 or 3")
    }
    else{
      print("Given number is not divisible by either 2 or 3")
    }
  }

}
