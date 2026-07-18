class BankAccount
{
         private double balance;

         public void selfBalance(double balance){
                if (balance < 0){
                        throw new ILLegalArgumentException(s:"Balance cannot be negative!");
                }
                this.balance = balance;
               System.out.println("Balance updated to:"+ this.balance);
         }

         public double getBalance(){
                  return this.balance;
}

}










