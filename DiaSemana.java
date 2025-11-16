package ejercicios;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int diaSemana;
		
		System.out.print("Ingresa un numero del 1 al 7: ");
		diaSemana = scan.nextInt();
		
		if(diaSemana == 1 ) {
			System.out.print("El dia de la semana correspondiente es lunes");
		}else if(diaSemana == 2) {
			System.out.print("El dia de la semana correspondiente es martes");
		}else if(diaSemana == 3) {
			System.out.print("El dia de la semana correspondiente es miercoles");
		}else if(diaSemana == 4) {
			System.out.print("El dia de la semana correspondiente es jueves");
		}else if(diaSemana == 5) {
			System.out.print("El dia de la semana correspondiente es viernes");
		}else if(diaSemana == 6) {
			System.out.print("El dia de la semana correspondiente es sabado");
		}else if(diaSemana == 7) {
			System.out.print("El dia de la semana correspondiente es domingo");
		}else {
			System.out.print("Numero no valido");
		}
		scan.close();

	}

}
