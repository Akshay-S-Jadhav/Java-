import java.util.Scanner;

public class tablewoloop {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your number to display its table : ");
        int t = sc.nextInt();

        System.out.println("The Table of " +t+ " is below");

        System.out.println(t+ "x 1 =" +t*1);
        System.out.println(t+ "x 2 =" +t*2);
        System.out.println(t+ "x 3 =" +t*3);
        System.out.println(t+ "x 4 =" +t*4);
        System.out.println(t+ "x 5 =" +t*5);
        System.out.println(t+ "x 6 =" +t*6);
        System.out.println(t+ "x 7 =" +t*7);
        System.out.println(t+ "x 8 =" +t*8);
        System.out.println(t+ "x 9 =" +t*9);
        System.out.println(t+ "x 10 =" +t*10);

        sc.close();
        
    }
}
