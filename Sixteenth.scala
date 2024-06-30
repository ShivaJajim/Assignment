//16)Check for Divisibility by 2 OR 5:
//  Write a Scala function to check if a given number is divisible by either 2 or 5.
//Sample Data:
//  SEEKHO BIGDATA INSTITUTE
//Number: 25

object Sixteenth {
  def main(args:Array[String]): Unit = {

    var n =25
    if (n%2==0 || n%5 ==0){
      print("Given number is divisible by either 2 or 5")
    }
    else {
      print("Given number is not divisible by either 2 or 5")
    }


  }

}
