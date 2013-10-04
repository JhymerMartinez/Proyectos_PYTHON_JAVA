package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception, IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		double factorial = 1;
		double suma = 0;
		boolean bandera = true;
		int cont = 1;
		int numero, num1, num2, i;

		do {
			System.out.print("Ingrese el limite: ");
			numero = Integer.parseInt(br.readLine());
		} while (numero <= 1);
		num1 = 0;
		num2 = 1;
		for (int k = 1; k <= numero; k++) {

			for (i = 2; i <= k; i++) {

				if (cont <= numero) {
					if (bandera) {
						if (num1 == 0) {
							System.out.print(num1 + "!");
							// System.out.print(factorial+" ");
						}
						for (int j = num2; j >= 1; j--) {
							factorial = factorial * j;
						}
						/*if(cont == numero){
							System.out.print(" - "+num2+ "!");
						}else{*/
							System.out.print(" - "+num2 + "!");
						
						// System.out.print(factorial+" ");
						if (num1 == 0) {
							suma = suma + 1;
						}
						suma = suma + factorial;
						num2 = num1 + num2;
						num1 = num2 - num1;
						factorial = 1;
					}else{
						if (num1 == 0) {
							System.out.print(num1 + "!");
							// System.out.print(factorial+" ");
						}
						for (int j = num2; j >= 1; j--) {
							factorial = factorial * j;
						}
						
						/*if(cont == numero){
							System.out.print(num2);
						}else{*/
							System.out.print(" + "+num2 + "!");
						
						// System.out.print(factorial+" ");
						if (num1 == 0) {
							suma = suma + 1;
						}
						suma = suma + factorial;
						num2 = num1 + num2;
						num1 = num2 - num1;
						factorial = 1;
					}
				} else{
					break;
				}
				cont++;
			}
			if (k % 2 == 0) {
				bandera = true;
			} else {
				bandera = false;
			}
			
		}

		System.out.print("  => Suman: " + suma);
	}

}
