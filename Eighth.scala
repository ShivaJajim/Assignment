//8)Eligibility for Senior Discount OR Student Discount:
//  Create a Scala program to check if a person is eligible for a senior citizen discount (age greater than
//60) or a student discount (age less than 25).
//Sample Data:
//  Age: 63
object Eighth {
  def main(args: Array[String]): Unit = {
    var a = 63
    if (a > 60) {
      print("person is eligible for a senior citizen discount (age greater than 60)")
    }
    else if (a < 25) {
      print("person is eligible for a student discount (age less than 25)")
    }
    else {
      print("Not eligible")
    }

  }
}
