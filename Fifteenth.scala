//15)Age Group Classification with AND:
//  Create a Scala program to classify a person's age group. Classify them as a child (less than 13),
//teenager (between 13 and 19), and an adult (20 and above) using both logical AND and OR.
//  Sample Data:
//  Age: 15
object Fifteenth {
  def main(rgs:Array[String]): Unit = {
    var a = 15
    if(a<13){
      print("CHind ")

    }
    else if (a<13 || 19 >a){
      print("Teeanager")
    }
    else if(a==20 && 20>a)
      {
        print("Adult")
      }
      else{
        print("None " +
          "")
      }

  }

}
