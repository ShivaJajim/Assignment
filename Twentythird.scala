//23)Eligibility for Discount OR Membership Benefits:
//  SEEKHO BIGDATA INSTITUTE
//Create a Scala program to check if a customer is eligible for a discount (purchase amount greater
//  than 200) or qualifies for membership benefits (loyalty card available).
//  Sample Data:
//  Purchase Amount: 180
//Loyalty Card: true

object Twentythird {
  def main(args:Array[String]):Unit={
   var a = 180
    if (a >200){
      print("customer is eligible for a discount")
    }
    else {
      print("qualifies for membership benefits")
    }

  }

}
