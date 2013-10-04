package prueba_bandera_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws Exception, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Ingrese valor:");
		int valor = Integer.parseInt(br.readLine());
		boolean bandera = true;
		int cont = 1;

		for (int j = 1; j <= valor; j++) {

			for (int i = 1; i <= j; i++) {
				if (cont <= valor) {
					if (bandera) {
						if(cont == valor){
							System.out.print(cont);
						}else{
							System.out.print(cont+" + ");
						}
					} else {
						if(cont == valor){
							System.out.print(cont);
						}else{
							System.out.print(cont+" - ");
						}
					}
				}else{
					break;
				}
				cont++;
			}
			if (j % 2 == 0) {
				bandera = true;
			} else {
				bandera = false;
			}
		}
	}
}
