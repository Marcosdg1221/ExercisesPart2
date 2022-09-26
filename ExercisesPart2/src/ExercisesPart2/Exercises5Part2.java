package ExercisesPart2;

import java.util.*;

public class Exercises5Part2 {

		public static void main(String[] args) {
			//Creo el scanner
			Scanner sc = new Scanner(System.in);
			//Pido la longitud de un rectángulo
			System.out.print("Dime la longitud de un rectángulo");
			//Creo la variable de la longitud
			float longitud;
			//El usuario escribirá el valor de la variable
			longitud = sc.nextInt();
			//Creo la variable del ancho del rectángulo
			float ancho;
			//Muestra el resultado
			ancho = sc.nextInt();
			float perímetro = ((ancho * 2) + (longitud *2));
			float área = (ancho * longitud);
			System.out.print("El perímetro del rectángulo es " + perímetro + "y su área es " + área);
			
	}
	}
