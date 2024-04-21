import java.util.*;

public class Grade_calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("GRADE CALCULATOR:");
		System.out.println("Enter The Mark 1:");
		int m1 = sc.nextInt();
		System.out.println("Enter The Mark 2:");
		int m2 = sc.nextInt();
		System.out.println("Enter The Mark 2:");
		int m3 = sc.nextInt();
		int sum = m1 + m2 + m3;
		int avg = sum / 3;
		System.out.println("Total Marks :" + sum);
		System.out.println("Average Percentage :" + avg);
		System.out.println("YOUR GRADE");
		if (avg >= 90)
			System.out.println("Grade A");
		else if (avg >= 80)
			System.out.println("Grade B");
		else if (avg >= 70)
			System.out.println("Grade C");
		else if (avg >= 60)
			System.out.println("Grade D");
		else if (avg >= 40)
			System.out.println("Grade E");
		else
			System.out.println("Sorry you have faild better luck next time");
	}
}