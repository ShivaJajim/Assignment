//6)Generate and print the first 5 multiples of 3 using a "for" loop.
object Loop6 {
  def main(args:Array[String]):Unit={
    var n=3
    for(i<- 1 to 5){
      var p=n*i
      println(p)
    }
  }

}
