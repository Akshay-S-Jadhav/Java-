import java.util.Scanner;

public class basiccalculator {
    public static void main(String[] args) {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("This is the basic calculator");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("________________________________________________");
        System.out.print("Enter the first number : ");
        a = sc.nextInt();
        System.out.print("Enter the Second number : ");
        b = sc.nextInt();
        System.out.println("________________________________________________");

        int ch;
        System.out.println("________________________________________________");
        System.out.println(" 1 : Addition Operation");
        System.out.println(" 2 : Substraction Operation");
        System.out.println(" 3 : Multiplication Operation");
        System.out.println(" 4 : Division Operation");
        System.out.println(" 5 : Remainder or Modulo Operation");
        System.out.println("________________________________________________");
        System.out.print("Make a choice from above to perform operation : ");
        ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Addition of the number is : "+ (a+b));
                break;
            case 2:
                System.out.println("Substraction of the number is : "+ (a-b));
                break;
            case 3:
                System.out.println("Multiplication of the number is : "+ (a*b));
                break;
            case 4:
                System.out.println("Division of the number is : "+ (a/b));
                break;
            case 5:
                System.out.println("Remainder or Modulo of the number is : "+ (a%b));
                break;
            default:
                System.out.println("Invalid Operation Input");
                break;
        }
        sc.close();

    }
    
}
