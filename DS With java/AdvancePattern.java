// import java.util.*;
public class AdvancePattern {
  public static void main(String[] args) {

 // daimond pattern

 int n =4;
//  upper half

 for(int i=1;i<=n;i++){//outer loop
   for(int j=1;j<=n-i;j++){
     System.out.print(" ");
   }
   for (int j =1 ; j<=2*i; j++){
     System.out.print("*");
   }
     System.out.println(" ");
 }

//lower half

for(int i=n;i>=1;i--){//outer loop
  for(int j=1;j<=n-i;j++){
    System.out.print(" ");
  }
  for (int j =1 ; j<=2*i; j++){
    System.out.print("*");
  }
    System.out.println(" ");
}

    
  }
  
}

   // ==============13=======i==
    // palindromic pattern
    // int n =5;
    // for (int i=1; i<n; i++) {
    //   //spaces 
    //   for(int j= 1; j<=n-i;j++){
    //     System.out.print(" ");
    //   }
    //   // 1 phASE NUMBER PRINT
    //   for(int j=i; j>=1; j--){

    //     System.out.print(j);

    //   }
    //   for (int j =2; j<=i; j++){
    //     System.out.print(j);
    //   }
    //   System.out.println(" ");
    // }


    // -------------------12----------
    // number pyramid
    // int n =5;
    // for (int i = 1; i <= n; i++) {
    //   for (int j = 1; j <= n-i; j++) {
    //   System.out.print(" ");
    //   }
    //   for (int j = 1; j <= i; j++) {
    //   System.out.print(i+" ");
    //   }
    
    // System.out.println();
    // }




// -------------------11-------------
//solid rhonbas
    // int n=5;
    // for (int i=0; i<n; i++) {
    //   //spaces
    // for(int j=1 ; j<=n-i; j++) {
    //   System.out.print(" ");
    // }
    // for(int j=1 ; j<=n; j++) {
    //   System.out.print("*");
    // }
    // System.out.println(" ");
    
    
    // }






// -------10---------------------


  // // buttetfly pattern
  // int n =4;
  // //upper half
  // for(int i=1; i<=n; i++){
  //   for (int j=1;j<=i;j++){
  //     System.out.print("*");

  //   }
  //   //spaces b/w
  //   int spaces = 2*(n-i);
  //   for(int j=1; j<=spaces; j++){
  //     System.out.print(" ");

  //   }
    
  //   // 2 part
  //   for (int j=1;j<=i;j++){
  //     System.out.print("*");
  //   }
  //   System.out.println();
  // }
  // // lowerhalf
  // for(int i=n; i>=1; i--){
  //   // first part
  //       for (int j=1;j<=i;j++){
  //         System.out.print("*");
    
  //       }
  //       //spaces b/w
  //       int spaces = 2*(n-i);
  //       for(int j=1; j<=spaces; j++){
  //         System.out.print(" ");
    
  //       }
        
  //       // 2 part
  //       for (int j=1;j<=i;j++){
  //         System.out.print("*");
  //       }
  //       System.out.println();
  //     }