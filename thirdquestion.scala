//3)Odd Number Check with AND:
//  Implement a Scala function to check if a given number is odd and not divisible by 3.
//Sample Data:
//  Number: 27

object thirdquestion {
  def main(args:Array[String]): Unit = {
    var a=27
    if ( a%2==1 && a%3 !=0){
      print("Given number is odd and not divisible by 3")
    }
    else {
      print("Given number is odd and  divisible by 3")
    }

  }
}
