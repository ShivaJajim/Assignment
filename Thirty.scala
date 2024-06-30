//30)Eligibility for Student Discount OR Free Trial:
//  Write a Scala program to check if a person is eligible for a student discount (age less than 25) or is
//  eligible for a free trial.
//  Sample Data:
//  Age: 22
//Free Trial: true

object Thirty {
  def main(args:Array[String]):Unit={
    var a =22
    if( a<25) {
      print("person is eligible for a student discount")
    }
    else {
      print("person is eligible for free trial.")
    }
  }

}
