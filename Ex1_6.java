import java.util.Scanner;

public class Ex1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of minutes: ");
        int minutes = sc.nextInt();

        int days = minutes / (60 * 24);
        int remain = minutes % (60 * 24);
        int hours = remain / 60;
        int min = remain % 60;

        System.out.println(days + " days, " + hours + " hours, " + min + " minutes");
        sc.close();
    }
}
