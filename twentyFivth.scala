//25)Check for Positive AND Not Divisible by 3:
//  Implement a Scala program to check if a given number is positive and not divisible by 3.
//Sample Data:
//  Number: 7

object twentyFivth {
  def main(args:Array[String]):Unit={
    var a =7
    if(a>0 && a%3 !=0){
      print("Given number is positive and not divisible by 3")
    }
    else {
      print("Given number is not positive and not divisible by 3")
    }


  }

}
