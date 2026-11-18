import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.print("Equilateral Triangle");
            }
            else if (a == b || b == c || a == c) {
                System.out.print("Isosceles Triangle");
            }
            else {
                System.out.print("Scalene Triangle");
            }
        }
        else {
            System.out.print("Invalid Triangle");
        }
        sc.close();
    }
}