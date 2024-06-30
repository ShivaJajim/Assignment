//5)Eligibility for Voting OR Driving:
//  Create a Scala program to check if a person is eligible to vote (age greater than or equal to 18) or
//  eligible to drive (age greater than or equal to 16).
//  Sample Data:
//  Age: 20

object FIve {
  def main(args:Array[String]):Unit={
    var a=14
    if(a>=18 ){
      printf("Person is eligible to vote (age greater than or equal to 18)")
    }
    else if ( a>=16) {
      print("eligible to drive (age greater than or equal to 16)")

    }
    else{
      print("Not eligible")
    }
  }

}
