//26)Eligibility for Senior Discount AND Not a New Customer:
//  Create a Scala program to check if a person is eligible for a senior citizen discount (age greater than
//65) and is not a new customer.
//Sample Data:
//  Age: 70
//New Customer: false

object TwentySix {
 def main(args:Array[String]):Unit= {
   var a = 70
   if(a>65){
     print("Person is eligible for a senior citizen discount ")
   }
   else {
     print("Person is not a new customer")
   }
 }

}
