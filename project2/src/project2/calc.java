package project2;
import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type the number of the calculation you want to perform");
		System.out.println("1 addition");
		System.out.println("2 subtraction");
		System.out.println("3 multiplication");
		System.out.println("4 division");
		System.out.println("5 square");
		System.out.println("6 square root");
		System.out.println("7 remainder");
		
		Scanner keyboard = new Scanner(System.in);
		int entry1 = keyboard.nextInt();
		
		switch (entry1) {
		case 1:
			System.out.println("type in the first number you want to add");
			Scanner keyboard1 = new Scanner(System.in);
			int add1 = keyboard1.nextInt();
			System.out.println("type in the second number you want to add");
			Scanner keyboard2 = new Scanner(System.in);
			int add2 = keyboard2.nextInt();
			int sum = add1 + add2;
			System.out.println("your answer is " + sum);
			break;
		case 2:
			System.out.println("type in the first number you want to subtract");
			Scanner keyboard3 = new Scanner(System.in);
			int sub1 = keyboard3.nextInt();
			System.out.println("type in the second number you want to subtract");
			Scanner keyboard4 = new Scanner(System.in);
			int sub2 = keyboard4.nextInt();
			int res = sub1 - sub2;
			System.out.println("your answer is " + res);
			break;
		case 3:
			System.out.println("type in the first number you want to multiply");
			Scanner keyboard5 = new Scanner(System.in);
			int mult1 = keyboard5.nextInt();
			System.out.println("type in the second number you want to multiply");
			Scanner keyboard6 = new Scanner(System.in);
			int mult2 = keyboard6.nextInt();
			int prod = mult1 * mult2;
			System.out.println("your answer is " + prod);
			break;
		case 4:
			System.out.println("type in the first number you want to divide");
			Scanner keyboard7 = new Scanner(System.in);
			int div1 = keyboard7.nextInt();
			System.out.println("type in the second number you want to divide");
			Scanner keyboard8 = new Scanner(System.in);
			int div2 = keyboard8.nextInt();
			int div = div1 / div2;
			System.out.println("your answer is " + div);
			break;
		case 5:
			System.out.println("type in the number you want to square");
			Scanner keyboard9 = new Scanner(System.in);
			int sq1 = keyboard9.nextInt();
			int square = sq1 * sq1;
			System.out.println("your answer is " + square);
			break;
		case 6:
			System.out.println("type in the number you want to find the square root of");
			Scanner keyboard10 = new Scanner(System.in);
			double sqrt1 = keyboard10.nextInt();
			double x = Math.sqrt(sqrt1);
			System.out.println("your answer is " + x);
			break;
		case 7:
			System.out.println("type in the first number you want to divide");
			Scanner keyboard11 = new Scanner(System.in);
			int divi1 = keyboard11.nextInt();
			System.out.println("type in the second number you want to divide");
			Scanner keyboard12 = new Scanner(System.in);
			int divi2 = keyboard12.nextInt();
			
			int divi = divi1 / divi2;
			int divid = divi1 % divi2;
			System.out.println("your answer is " + divi);
			System.out.println("your remainder is " + divid);
		
		}

	}

}
