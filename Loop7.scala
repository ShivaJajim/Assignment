//7)Print odd numbers from 1 to 15 using a "while" loop.
object Loop7 {
  def main(args:Array[String]):Unit={
    for(i<- 1 to 15){
      if(i%2==1){
        println(i)
      }
    }
  }

}
