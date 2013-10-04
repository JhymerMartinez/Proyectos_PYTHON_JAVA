package fibonaci_java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Ingrese limite: ");
		
		int limite = Integer.parseInt(br.readLine());
		long multiplic = 1;
		double aux=0;
		double contador = 1;
		double numero = 2;
		double divisor = 2;
		
		while (contador <= limite-1) {
		   if (numero % divisor == 0) {
		      if (numero == divisor) {	
		    	  if(contador == 1){
			    	  for (int i =1;i<=contador;i++){
							multiplic = multiplic * i;
						}
					  System.out.print(numero-1+"^("+contador+"/"+multiplic+"), ");
					  //System.out.print(Math.pow(numero-1, (contador/multiplic))+",");			  
				  } 
		    	  multiplic = 1;
		    	  for (int i=1;i<=(contador+1);i++){
						multiplic = multiplic * i;
				}  
		         System.out.print(numero+"^("+(contador+1)+"/"+multiplic+"), ");
		         if(contador == 1){
		        	 aux=aux+(Math.pow(numero-1,(contador/multiplic)));
		         }
		         aux = aux + (Math.pow(numero,((contador+1)/multiplic)));
		        // System.out.print(Math.pow(numero, ((contador+1)/multiplic))+",");
		         contador++;		         
		      }	      
		      divisor = 2;
		      numero++;
		   }else
		      divisor++;
		}
		System.out.print("  Suma= "+aux);
	}

}
