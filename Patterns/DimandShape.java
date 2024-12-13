// With Spaces

//import java.util.Scanner;
//public class DimandShape {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
//        for(int i=0;i<n;i++) {
////            top Shape
//            for (int j = 0; j < n - i - 1; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < i + 1; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
////        bottom shape
//        for(int i=0;i<n;i++) {
//            for (int j = 0; j < i+1; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 0; k < n-i - 1; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

// without spaces

import java.util.Scanner;
public class DimandShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++) {
//            top Shape
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
           for(int k=0;k<i*2+1;k++){
               System.out.print("*");
        }
            System.out.println();
        }
        //           Bottom Shape
        for(int i=0;i<n-1;i++){
            for(int m=0;m<i+1;m++){
                System.out.print(" ");
            }
            for(int l=0;l<2*(n-1-i)-1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
