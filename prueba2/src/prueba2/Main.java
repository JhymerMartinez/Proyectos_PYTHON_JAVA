package prueba2;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		BigInteger bg = new BigInteger("1");
		Scanner s =new Scanner(System.in);
		double suma=1;
		System.out.println("Ingrese un numero");
		int n=s.nextInt();

		for(int i=n;i>=1;i--){
			bg = new BigInteger(String.valueOf(bg.longValue()*i));
			
		//System.out.println("El factorial de "+n+" es "+suma);
		}
		System.out.println(bg);
		//System.out.println(bg);
		//System.out.println("El factorial de "+n+" es "+suma);
		}

		

	}


