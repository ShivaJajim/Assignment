//12)Eligibility for Discount OR Free Shipping:
//  Create a Scala program to check if a customer is eligible for a discount (purchase amount greater
//  than 150) or qualifies for free shipping (purchase amount greater than 100).
//  Sample Data:
//  Purchase Amount: 120

object Twelfth {
  def main(args:Array[String]):Unit={
    var a=120
    if(a>150){
      print("a customer is eligible for a discount (purchase amount greater than 150)")
    }
    else if (a>100)
      {
        print("a customer is  qualifies for free shipping (purchase amount greater than 100)")
      }
    else {
      print("Not eligible")
    }
  }

}
