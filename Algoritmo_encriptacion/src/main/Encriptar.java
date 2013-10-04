package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Encriptar {
	
	public void encriptar() throws Exception{
		ArrayList<String> alfabeto = new ArrayList<String>();
		alfabeto.add("a");alfabeto.add("b");alfabeto.add("c");
		alfabeto.add("d");alfabeto.add("e");alfabeto.add("f");
		alfabeto.add("g");alfabeto.add("h");alfabeto.add("i");
		alfabeto.add("j");alfabeto.add("k");alfabeto.add("l");
		alfabeto.add("m");alfabeto.add("n");alfabeto.add("o");
		alfabeto.add("p");alfabeto.add("q");alfabeto.add("r");
		alfabeto.add("s");alfabeto.add("t");alfabeto.add("u");
		alfabeto.add("w");alfabeto.add("x");alfabeto.add("y");
		alfabeto.add("z");
		
		ArrayList<String> lista = new ArrayList<String>();
		ArrayList<String> resultado = new ArrayList<String>();

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Ingrese una palabra a encriptar: ");
		
		String palabra = String.valueOf(br.readLine());
		
		for (int i=0;i<=palabra.length()-1;i++){

			lista.add(String.valueOf(palabra.charAt(i)));
		}
			
		for (int i=0;i<=lista.size()-1;i++){

			for (int j=0;j<=alfabeto.size()-1;j++){
				if(lista.get(i).equals(alfabeto.get(j))){
					if(lista.get(i).equals("z")){
						resultado.add("a");
					}else{
						resultado.add(alfabeto.get(j+1));	
					}
				}	
			}
			
		}
		
		for (int i=0;i<=resultado.size()-1;i++){
			System.out.print(resultado.get(i));		
		}
	}


public void desencriptar() throws Exception{
	ArrayList<String> alfabeto = new ArrayList<String>();
	alfabeto.add("a");alfabeto.add("b");alfabeto.add("c");
	alfabeto.add("d");alfabeto.add("e");alfabeto.add("f");
	alfabeto.add("g");alfabeto.add("h");alfabeto.add("i");
	alfabeto.add("j");alfabeto.add("k");alfabeto.add("l");
	alfabeto.add("m");alfabeto.add("n");alfabeto.add("o");
	alfabeto.add("p");alfabeto.add("q");alfabeto.add("r");
	alfabeto.add("s");alfabeto.add("t");alfabeto.add("u");
	alfabeto.add("w");alfabeto.add("x");alfabeto.add("y");
	alfabeto.add("z");
	
	ArrayList<String> lista = new ArrayList<String>();
	ArrayList<String> resultado = new ArrayList<String>();

	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	System.out.print("\nIngrese una palabra para desencriptar: ");
	
	String palabra = String.valueOf(br.readLine());
	
	for (int i=0;i<=palabra.length()-1;i++){

		lista.add(String.valueOf(palabra.charAt(i)));
	}
		
	for (int i=0;i<=lista.size()-1;i++){

		for (int j=0;j<=alfabeto.size()-1;j++){
			if(lista.get(i).equals(alfabeto.get(j))){
				if(lista.get(i).equals("a")){
					resultado.add("z");
				}else{
					resultado.add(alfabeto.get(j-1));	
				}
			}
		}	
	}
	
	for (int i=0;i<=resultado.size()-1;i++){
		System.out.print(resultado.get(i));		
	}
}
}