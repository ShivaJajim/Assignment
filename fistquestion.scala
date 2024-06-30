//1)Check for Even AND Positive Number:
//  Write a Scala function to check if a given number is both even and positive.
//Sample Data:
//  Number: 14

object fistquestion {
  def main(args:Array[String]):Unit={
    var a= -14

    if(a>0 &&  a%2==0){
      print(" Give numer even and postive")
    }
    else {
      print("Give Number not a even and postive number")
    }

  }

}
