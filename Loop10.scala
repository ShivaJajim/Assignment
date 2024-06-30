//10)Check if a number is prime using a "while" loop.
object Loop10 {
  def main(args:Array[String]):Unit={
    var num=7
    var count=0
    for (i<- 1 to num){
      if (num%i==0){
        count=count+1

      }
    }
    if(count==2){
      print("Given Number is prime: "+num)
    }
  }

}
