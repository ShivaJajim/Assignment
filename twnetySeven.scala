//27)Check for Odd OR Prime Number:
//  Write a Scala function to check if a given number is either odd or a prime number.
//Sample Data:
//  Number: 11
object twnetySeven {
  def main(args:Array[String]):Unit={
    var a=11
    var count=0
    for(i<- 1 to a){
      if(a%i==0){
        count=count+1

      }

    }
    if(count==2 || a==1 || a%2==1){
      print("Given number is either odd or a prime number")
    }
    else {
      print("Given number is not  odd or a prime number")
    }
  }

}
