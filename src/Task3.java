import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
       
        if (num > 0) {
            System.out.print("Number is positive");
        }
        else if (num < 0) {
            System.out.print("Number is negative");
        }
        else {
            System.out.print("Number is zero");
        }
        sc.close();
    }
}