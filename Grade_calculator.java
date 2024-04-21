import java.util.*;
public class Grade_calculator
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Marks");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int sum =a+b+c;
		int avg=sum/3;
		System.out.println("Total No Of Marks :"+sum);
		System.out.println("Average Percentage :"+avg);
		if(avg>=90)
			System.out.println("Grade A");
		else if(avg>=80)
			System.out.println("Grade B");
		else if(avg>=70)
			System.out.println("Grade C");
		else if(avg>=60)
			System.out.println("Grade D");
		else if(avg>=40)
			System.out.println("Grade E");
		else
			System.out.println("Grade F");
	}
}