import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int largest;
		
		if(a>=b && a>=c)
		{
			largest=a;
		}
		else if (b>=c && b>=a)
		{
			largest=b;
		}
		else {
			largest=c;
		}
		System.out.print("largest number: "+largest);
    sc.close();
	}

}