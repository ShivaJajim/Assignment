//21)Check for Odd AND Not Divisible by 4:
//  Create a Scala program to check if a given number is both odd and not divisible by 4.
//Sample Data:
//  Number: 15

object Twentyone {
  def main(args:Array[String]):Unit={
    var a =25
    if( a%2 == 1 && a%4 !=0){
      print("Given number is both odd and not divisible by 4")
    }
    else{
      print("Given number is  both  not odd or  divisible by 4")
    }

  }


}
