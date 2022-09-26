package ExercisesPart2;

public class Exercises4Part2 {
	public static void main(String[] args) {
		// declare variables
		int x, y;
		// enter values
		System.out.print("Enter value for x ");
		x = keyboard.nextInt();
		System.out.print("Enter value for y ");
		y = keyboard.nextInt();
		// code attempting to swap two variables
		x = y;
		y = x;
		//display results
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		}
//El programa está fijando la variable de x a y, y luego de y a x, 
//debido a que y tiene el mismo valor que x al momento de coger el valor de x,
//los dos tienen el mismo valor que tenía x sin cambiarse.

//Podríamos solucionar este programa añadiendo una variable que coja el valor de x,
//y después fijando x a y, y que y coja el valor de la nueva variable que hemos puesto.
}
