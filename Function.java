import java.util.Scanner;

public class Function {
    public static void myName(String name) {
        System.out.println("My name is " + name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        myName(name);
    }

}
