public class Ex1_4 {
    public static void main(String[] args) {
        double a = 2;
        double b = 3;
        double c = 4;
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Triangle area = " + area);
    }
}

