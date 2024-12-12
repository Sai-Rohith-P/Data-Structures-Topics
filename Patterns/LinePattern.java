import java.util.Scanner;
class LinePattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :-  ");
        int num = sc.nextInt();

        for(int i=0;i<num;i++){
//            System.out.print("*"+" ");
            System.out.println("*");
        }
    }
}