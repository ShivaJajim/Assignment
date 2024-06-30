//18)Check if a given number is a perfect square using a "while" loop.
object Loop18 {
  def main(args:Array[String]):Unit={
    var a =25
    var count=0
    for (i<- 1 to a){
      if( a == (i*i)) {

       print(i)

        count=1
      }


    }
    if ( count==1){
      print("Given number is  perfect square ")
    }
    else {
      print("Given number is not a perfect square ")
    }

  }

}
