
import java.util.*;


public class circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please give the radius of the circle : ");
        float pi = 3.14f;
        int r = sc.nextInt();
        

        float area, cercumferance;

        area = pi*r*r;
        cercumferance = 2*pi*r;

        System.out.println("Area of the circle is : " +area);
        System.out.println("The cercumferance of the circle is : " +cercumferance);
        sc.close();
    }
    
}
