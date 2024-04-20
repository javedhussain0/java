public class pattern {
   //0-1 triangles

   public static void main(String[] args) {
      int n=5;
     
      for (int i=1;i<=n;i++){

      for (int j=1;j<=i;j++){

         int sum =i+j;
      if (sum % 2 ==0){
         System.out.print("1");
      } 
      else{
         System.out.print("0");
      }
     
   }
   System.out.println(" ");
       }
      }
   }


 //8-floyed triangle pattern
//  int n=5;
//  int number=1;
//  for (int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//        System.out.print(number + " ");
//        number++;
//     }
//     System.out.println();
//  }

 //7-inverted half pyramid with nummber
      // int n =5;
      // for (int i=1;i<=n;i++){
      //    for (int j=1;j<=n-i+1;j++){
      //       System.out.print(j);
      //    }
      //    System.out.println();
      // }
 
//6- half pyramid with number
// int n =5;
// for (int i=1;i<=n;i++){
//    for(int j=1;j<=i;j++){
//       System.out.print(j+"");
//    }
//    System.out.println();
// }

 // 5 invert half-pyramid 180 rotate      
//  int n =4;
//  for (int i =1; i<=n;i++){
//     //inner loop =>space print
//     for (int j=1;j<=n-i;j++){
//        System.out.print(" ");
//     }
    
//     //inner loop => star print
//     for (int j=1;j<=i;j++){
//        System.out.print("*");
//     }
//     System.out.println("");
//  }


// 4-invert pyramid
//  int n=4;
//  for (int i=n;i>=1;i--) { //to invert the pattern of increment of star to the line
//  for (int j=1;j<=i;j++) {
 
//  System.out.print("*");
// }
// System.out.println();
//  }



//  3.-// half pyramid pattern 
    // row can 1 print star amd go second print 2 star
    // int n =4;
    // for (int i=1;i<=n;i++){ 
    //   for (int j=1;j<=i;j++){
    //     System.out.print("*");
    //   //to print star increment by the line 1 line = 1star
   //  2line=2star
    //   }
    //   System.out.println();
    // }




 //2 hollow pattern
//  int n=4;
//  int m=5;
//  for(int i =1;i<=n;i++){
//    for(int j=1 ;j<=m ; j++){
//      if(i==1 ||j==1 || i==n||j==m){
//      System.out.print('*');
//      }
//      else{
//        System.out.print(" ");
//      }
//    }
//    System.out.println();
//  }


  // 1.- //solid rectangle pattern
  //   int n =4;
  //   int m= 5;
  //   for(int i=1;i<=n;i++)
  //   {
    
  //     for(int j=1;j<=m;j++)
  //     {
  //       System.out.print("*");
  //     }
  //     System.out.println();
  //   }
    
 
