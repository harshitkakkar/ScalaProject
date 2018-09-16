package OObasics.Bank

class Account private(val Customer :Customer , val id :String) {
   private[this] var _balance = 0
   
   Customer.addAccount(this)
   
   def balance =_balance 
   
    def balance_=(newBalance: Int) = {
    if (newBalance < _balance) withdraw(_balance - newBalance)
    else deposit(newBalance - _balance)
  }
   
   Customer.addAccount(this)
   
   def deposit (ammount :Int):Boolean ={
    if(ammount<0)  false
    else{
    _balance += ammount
    true
    }
  }
   
  def withdraw(ammount :Int):Boolean ={
   if (ammount<0 || ammount>_balance) false
   else {
   _balance -= ammount
   true
   }
  }
}

object Account {
    private var nextAccountNumber = 0
    
 def main(agrs:Array[String]):Unit ={
   val a =new Account(new Customer("Harshit","Kakkar","id",new Address(Nil)),"id")
   a.balance = 700
   a.balance +=40
 }
 
 def apply(c:Customer) :Account = {
  nextAccountNumber +=13
    new Account(c,nextAccountNumber.toString)
 }
}

