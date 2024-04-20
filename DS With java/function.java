import java.util.Scanner;
public class function{
  public static int calculateDiv(int a, int b){
  int div = a / b;  
  return div;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int div = calculateDiv(a, b);
    System.out.println(" div of  two number :"+div);
  }
}

// import java.util.Scanner;
// public class function{
//   public static int calculateMul(int a, int b){
//   int mul = a * b;  
//   return mul;
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int mul = calculateMul(a, b);
//     System.out.println("Mul of  two number :"+mul);
//   }
// }

// import java.util.Scanner;
// public class function{
//   public static int calculateSub(int a, int b){
//   int sub = a - b;  
//   return sub;
//   }
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int sub = calculateSub(a, b);
//     System.out.println("sub of  two number :"+sub);
//   }
// }
// import java.util.Scanner;

// public class function {
//     public static int calculateSum(int a, int b) {
//         int sum = a + b;
//         return sum;
//     }

    
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = calculateSum(a, b);
//         System.out.println(sum);
//     }
// }


//{
//     public static void publicMyName(String name) {
//         System.out.println(name);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();
//         publicMyName(name);
//     }
// }