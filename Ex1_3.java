import java.util.Scanner;

public class Ex1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        
        double area = Math.PI * r * r;
        System.out.println("Area = " + area);
        sc.close();
    }
}
