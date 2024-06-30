//2)Range Check with OR:
//  Create a Scala program to determine if a given value is either less than -10 or greater than 10.
//Sample Data:
//  Value: -15

object secondquestion {
  def main(arrgs:Array[String]): Unit = {
    var a= -15
    if (a < -10 || a>10)
    {
      print("Give number is less thean -10 or grathe than 10")
    }
  }

}
