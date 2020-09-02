import java.util.Scanner;

class Main {
  public static void main(String[] args) 
{
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter in the monetary value: ");
   double m = scan.nextDouble();
   //m is the money

   int c = (int) (m*100);
   //c is the cents
   //start by finding 10s, 5s, 1s, Quarters, Dimes, Nickels, Pennies

   int tens = c / 1000;

   c -= tens*1000;

   int fives = c / 500;

   c -= fives*500;

   int ones = c / 100;

   c -= ones*100;

   int quarters = c / 25;

   c -= quarters*25;

   int dimes = c / 10;

   c -= dimes*10;

   int nickels = c / 5;

   c -= nickels*5;

   int pennies = c / 1;

   c -= pennies*1;

   System.out.println(tens + " tens");
   System.out.println(fives + " fives");
   System.out.println(ones + " ones");
   System.out.println(quarters + " quarters");
   System.out.println(nickels + " nickels");
   System.out.println(pennies + " pennies");
}
}