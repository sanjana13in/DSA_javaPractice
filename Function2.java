import java.util.Scanner;

public class Function2 {
    public static int Multi(int a, int b) {
        System.out.println("Value is: " + a * b);
        int mul = a * b;
        return mul;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Multi(a, b);
    }
}
