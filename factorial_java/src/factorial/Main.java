package factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Ingrese valor:");
		int valor = Integer.parseInt(br.readLine());
		long multiplic = 1;
		
		for (int i =1;i<=valor;i++){
			multiplic = multiplic * i;
			System.out.print(multiplic+ " ");
		}
	}

}
