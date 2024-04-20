// import java.util.Scanner;
//  public class test{
//   public static void main(String[] args){
//   Scanner sc= new Scanner(System.in);
//   System.out.println("enter the first number");
//   int x = sc.nextInt();
//   System.out.println("enter the first number");
//   int y = sc.nextInt();
//   System.out.println("enter the first number");
//   int z = sc.nextInt();
// System.out.print("Average of three numbers:"+(x+y+z)/3);
//   }
//  } Q1. Averae of three numbers 

//  --------------------------------------------------------------------
// import java.util.Scanner;
// import java.util.*;
// public class test{
//   public static void main(String[] args) {
  
//     int sum = 0;
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter the Value of n");
//      int n =sc.nextInt();

//     for ( int i = 0; i <= n; i++) {
//       if (i % 2 == 1){
//         sum += i;
//       }
      
//     }
//    System.out.print("sum of odd numbers: ");
//    System.out.print(sum);

//     }
  // } sum of n number odd numbers
// ------------------------------------------------------------------------------------------------------


// import java.util.Scanner;
// import java.util.*;

//   public class test{
//   public static void main(String[] args) {
//     int sum = 0;
//     Scanner in =new Scanner(System.in);
//     System.out.println("enter the Value of n");
//     int n = in.nextInt();
//     for(int i=0; i<=n;i++){
//       if(i%2 == 0){
//         sum += i;
//       }
//     }
//     System.out.println("sum of even numbers: "+sum);

//   }
// }
// -------------------------------------------------------------------------
// import java.util.Scanner;
// import java.util.*;

// public class test{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter the value of x");
//     int x = sc.nextInt();
//     System.out.println("enter the value of y");
//     int y = sc.nextInt();
// if(x==y){
//   System.out.println("Both are equal");
// }
// else if(x>y){
//   System.out.println("x is greater than y");
// }
// else if(x<y){
//   System.out.println("x is smaller than y");
// }
//   }
  
// }
// import java.util.Scanner;
// import java.util.*;

// public class test{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter the value of x");
//     int x = sc.nextInt();
//     System.out.println("enter the value of y");
//     int y = sc.nextInt();
//     if (x == y){
//       System.out.println ("Both are Equal\n");
//     }
//     else
//       {
// 	int temp = x > y ? x : y;
// 	System.out.println (temp + " is largest");
//       }
//   }
// } using turnery operators who bigger those numbers
// ----------------------------------------------------------------------------------------

// import java.util.Scanner;
// import java.util.*;
// public class test{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter the of cirlce radius");
//     int r = sc.nextInt();
//     double  circumference ;
//     circumference = Math.PI*2*r;
//     System.out.println( "circumference of the circle is : "+circumference );
  
    
//   }

// } circumference of the circle

// import java.util.*;
// import java.util.Scanner;

// public class test {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter the age of x person");
//     int x = sc.nextInt();
   
//     if (x>18){
//       System.out.println("eligiable for right to vote");
//     }
//   else if(x==18){
//     System.out.println("eligible fot right to vote");
//   }
//     else if(x<18){
//       System.out.println("not eligible for right to vote");
//     }
//   }
// }

// import java.util.*;
// import java.util.Scanner;

// public class test {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter the age of age person");
//     int age = sc.nextInt();
//     System.out.println(age>18 || age==18?"Eligible: right to vote":"Not eligible for right to vote");
//     }
//     } age eligible for VOTE OR NOT
// ----------------------------------------------------------------------------------------------------------------------------------------

// import java.util.*;
// import java.util.Scanner;

// public class test{
//   public static void main(String[] args) {
//     do{ // one time till exceccaution after checking the  condition will excecauted the statement
//       System.out.println("javed");
//     }
//     while(true);//condition
//   }
// }
// -------------------------------------------------------------------------


// import java.util.*;
// import java.util.Scanner;

// public class test{
//   public static void main(String[] args) {

// Scanner in = new Scanner(System.in);
// int pos=0 ,  neg = 0, zero = 0 ;
// char choice;

// do{
//   System.out.println("Enter the number");
//   int number = in.nextInt();
//   if(number>0){
//     pos++;
//   }
//   else if(number<0){
//     neg++;
//   }
//   else{
//     zero++;
//   }
//   System.out.println("do you want to continuue y/n");
//   choice = in.next().charAt(0);
// }while(choice=='y' || choice=='Y');
// System.out.println("positive numbers:"+ pos);
// System.out.println("Negative numbers:"+ neg);
// System.out.println("Zero numbers:"+ zero);

//   }
// } while the chcking will enter is neg pos zero 


// -----------------------------------------------------------

// import java.util.*;
// import java.util.Scanner;
// public class text{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);

//     System.out.println("enter the number ");
//     int  number = sc.nextInt();

//     int result = power(number);
//     System.out.println("Result: "+result);

//      sc.close();
//   }
//   public static int power(int number) {

//     if(number == 0){
//         return 0;
//       }
//       else if (number>0){
//         return number * number;
  
//       }
//       else{
//         return -1;
//       }
//   }
// }Power of the number
// import java.util.Scanner;

// public class test {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         // Input the two numbers
//         System.out.print("Enter the first number: ");
//         int num1 = scanner.nextInt();
        
//         System.out.print("Enter the second number: ");
//         int num2 = scanner.nextInt();
        
//         // Calculate and print the GCD
//         int gcd = findGCD(num1, num2);
//         System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is: " + gcd);
        
//         scanner.close();
//     }

//     // Function to calculate GCD using Euclidean algorithm
//     public static int findGCD(int a, int b) {
//         // Keep finding remainder until it becomes 0
//         while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         // At this point, 'a' contains the GCD
//         return a;
//     }
// }
// --------------------------------------------------------------------
//
// -----------------------------------------fibonacci find nth term
import java.util.*;


public class test {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
      
       int a = 0, b = 1;
          
       System.out.print(a+" ");
      
       if(n > 1) {
           //find nth term
           for(int i=2; i<=n; i++) {
               System.out.print(b+" ");
               //the concept below is called swapping
               int temp = b;
               b = a + b;
               a = temp;
           }


           System.out.println();
       }
   }   
}
