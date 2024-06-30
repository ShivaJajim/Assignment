//28)Eligibility for Discount AND Free Shipping:
//  SEEKHO BIGDATA INSTITUTE
//Create a Scala program to check if a customer is eligible for a discount (purchase amount greater
//  than 150) and qualifies for free shipping (purchase amount greater than 100).
//  Sample Data:
//  Purchase Amount: 120

object TwnetyEight {
  def main(args: Array[String]): Unit = {
    var a = 120
    if (a > 100) {
      print("qualifies for free shipping")
      if (a > 150) {
        print("customer is eligible for a discount")
      }
    }
    else {
      print("customer is not eligible for a discount and free shipping ")
    }
  }
}
