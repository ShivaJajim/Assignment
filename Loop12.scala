//12)Find the sum of all even numbers from 1 to 20 using a "while" loop.
object Loop12 {
  def main(args:Array[String]):Unit={
    var sum=0
    for (i<- 1 to 20){
      if(i%2 == 0){
         sum=sum+i
      }
    }
  print(sum)
  }

}
