//Print the pattern:
//  1
//22
//333
//4444

object Pattern2 {
  def main(args:Array[String]):Unit={
    for(i<- 1 to 4){
      for(j<- 1 to i){
        print(i)
      }
      println()
    }
  }

}
