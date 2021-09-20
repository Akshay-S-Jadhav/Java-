import java.util.Scanner;

public class miniproject{

    public static void main(String[] args) {
	// MINI PROJECT
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;

        do{
            System.out.println("____________________________________________");
            System.out.println("         Guess my number(1 - 100) : ");
            System.out.println("____________________________________________");
            userNumber = sc.nextInt();

            if(userNumber == myNumber){
                System.out.println("____________________________________________");
                System.out.println("Heyy Heyy !!...... You Guessed it right");
                System.out.println(":)_________________  ^-^  _________________:)");
                break;
            }
            else if (userNumber > myNumber){
                System.out.println(".........................................");
                System.out.println("          Your number is greater");
                System.out.println(".........................................");
            }
            else{
                System.out.println(".........................................");
                System.out.println("           Your number is Small");
                System.out.println(".........................................");
            }
        }while(userNumber >= 0);
        System.out.println("____________________________________________");
        System.out.println("            My number was : "+ myNumber);
        System.out.println("____________________________________________");
    }
}