//19)Check for Multiple of 3 AND 7:
//  Implement a Scala function to check if a given number is both a multiple of 3 and 7.
//Sample Data:
//  Number: 21
object Nighteen {
    def main(args:Array[String]):Unit={
      var a =21
      if(a%3==0 && a%7 ==0){
        print("given number is both a multiple of 3 and 7")
      }
      else {
        print("given number is not both a multiple of 3 and 7")
      }


    }

}


