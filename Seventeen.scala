//17)Eligibility for Senior Discount AND Student Discount:
//  Create a Scala program to check if a person is eligible for both a senior citizen discount (age greater
//  than 60) and a student discount (age less than 25).
//Sample Data:
//  Age: 70
object Seventeen {
  def main(args:Array[String]):Unit={
    var a =70
    if(a>60){
      print("person is eligible for both a senior citizen discount ")
    }
    else if(a<25){
      print("a student discount (age less than 25).")
    }
    else {
      print("Please choose correct age")
    }
  }

}
