import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if(year % 4==0)
		{
			System.out.print("leap year");
		}
		else {
			System.out.print(" not leap year");
			
		}
		sc.close();
	}

}