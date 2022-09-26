package ExercisesPart2;

import java.util.Scanner;

public class Exercises3Part2 {
	public static void main(String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int num1, num2;
		num2 = 6;
		System.out.print("Enter value ");
		num1 = keyboard.nextInt();
		num1 = num1 + 2;
		num2 = num1 / num2;
		System.out.println("result = " + num2);
	//El resultado sería el número que ha escrito el usuario más dos entre seis.
		}

}
