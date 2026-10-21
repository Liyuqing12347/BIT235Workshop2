import java.util.Scanner;

public class Ex1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter years: ");
        int t = sc.nextInt();

        double amount = p * Math.pow(1 + r, t);
        System.out.println("Final amount = " + amount);
        sc.close();
    }
}
