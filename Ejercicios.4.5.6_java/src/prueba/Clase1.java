package prueba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Clase1 {

	public static void main(String[] args) throws IOException {
		long tiempoI = System.currentTimeMillis();
		//------------------------------------------------------
		
		//####################### EJERCICIO 4 ##########################
		/*System.out.print("Ingrese un valor por teclado: ");
		valor1 = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= valor1; i++){
			aux = 3 * i;
			if(aux <= valor1){
				System.out.println("3 X "+ i +" = " + aux);
			}*/
		
		//####################### EJERCICIO 5 ##########################
		/*
		int valor1;
		int suma = 0;
		int multiplicacion = 1;
		int i = 1;
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
			while(i <= 10){
				System.out.print("Ingrese el valo N°"+ i +" : ");
				valor1 = Integer.parseInt(br.readLine());
				if(valor1 > 0){
					suma = suma + valor1; 
				}else{
					multiplicacion = multiplicacion * valor1;
				}
				i++;
		}
		System.out.println("Suma = " + suma);
		System.out.println("Multiplic. = " + multiplicacion);
		
		*/
		
		//####################### EJERCICIO 6 ##########################
		
		
		ArrayList<Empleado> lista_empleados = new ArrayList<Empleado>();
		
		ArrayList<Empleado> lista_mayor = new ArrayList<Empleado>();
		ArrayList<Empleado> lista_menor = new ArrayList<Empleado>();
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);		
		Empleado empleado;
		int titulo1 = 0;
		int titulo2 = 0;
		System.out.println("Ingrese la cantidad de empleados que va a registrar: ");
		int cantidad_empleados = Integer.parseInt(br.readLine());
		
		for (int i=0;i<=cantidad_empleados-1;i++){
			empleado = new Empleado();
			System.out.print("Ingrese nombre del epleado N°"+ (i+1) +": ");
			empleado.setNombre(br.readLine());
			System.out.print("Ingrese el peso en [Kg]: ");
			empleado.setPeso(Integer.parseInt(br.readLine()));
			lista_empleados.add(i,empleado);
			System.out.print("\n");
		}
		
		System.out.println("###### LISTA DE EMPLEADOS #######\n");	
		for (int i=0;i<=lista_empleados.size()-1;i++){

			if(lista_empleados.get(i).getPeso()>80){		
				lista_mayor.add(lista_empleados.get(i));
			}else{
				lista_menor.add(lista_empleados.get(i));
			}
			
		}
			System.out.println("LISTA DE EMPLEADOS CON PESO MAYOR A 80 KG");
			for (int i=0;i<=lista_mayor.size()-1;i++){
				System.out.println("Empleado "+lista_mayor.get(i).getNombre()+" Tiene un peso de: "+lista_mayor.get(i).getPeso()+" Kg");
			}
			
			
			System.out.println("LISTA DE EMPLEADOS CON PESO MENOR A 80 KG");
			
			for (int i=0;i<=lista_menor.size()-1;i++){
				System.out.println("Empleado "+lista_menor.get(i).getNombre()+" Tiene un peso de: "+lista_menor.get(i).getPeso()+" Kg");
			}
		
		
		//------------------------------------------------------
		System.out.println("Tiempo total: " + String.valueOf(System.currentTimeMillis()-tiempoI) + " milisegundos");
		
	}
}
