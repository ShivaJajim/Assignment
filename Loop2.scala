//2)Print even numbers from 2 to 10 using a "while" / For loop.
object Loop2 {
  def main(args:Array[String]):Unit={
    for(i<- 2 to 10){
      if( i%2==0){
        print(i)
      }
    }
  }

}
