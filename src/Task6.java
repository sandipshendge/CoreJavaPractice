import java.util.Scanner;
public class Task6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();
        if (marks >= 90 && marks <= 100) {
            System.out.print("A Grade");
        }
        else if (marks >= 75 && marks <= 89) {
            System.out.print("B Grade");
        }
        else if (marks >= 60 && marks <= 74) {
            System.out.print("C Grade");
        }
        else if (marks >= 40 && marks <= 59) {
            System.out.print("D Grade");
        }
        else if (marks >= 0 && marks < 40) {
            System.out.print("Fail");
        }
        else {
            System.out.print("Invalid Marks");
        }
        sc.close();
    }
}