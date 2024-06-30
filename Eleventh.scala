//11)Check for Prime AND Odd Number:
//  Write a Scala function to check if a given number is both a prime number and an odd number.
//Sample Data:
//  Number: 17
object Eleventh {
  def main(args:Array[String]):Unit={
    var n=1
    var count=0

      for(i <- 1 to n ){
        if( n%i==0){
          count=count+1

        }
      }
      if((count==2 || n==1 )&& n%2 ==1 ) {
        print("Prime Number and Odd number")
      }
      else {
        print(" Not a Prime Number and Odd number")
      }

    }

}
