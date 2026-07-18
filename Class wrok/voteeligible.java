import java.util.Scanner;

public class voteeligible {
   public voteeligible() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter your age: ");
      int var2 = var1.nextInt();
      if (var2 >= 18) {
         System.out.println("Eligible to Vote");
      } else {
         System.out.println("Not Eligible to Vote");
      }

   }
}