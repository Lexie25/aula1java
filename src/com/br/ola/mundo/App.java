package com.br.ola.mundo;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {

//		int numX = 10;
//		double numXX = 1.6;
//		float numF = 1.9f;
//		String textoX = "Olá Mundo";
//		System.out.println(textoX);

		Scanner entrada = new Scanner(System.in); 
		int maximoEs = entrada.nextInt();
		System.out.println("Qual o Maximo do estoque ?");

		int minimoEs = entrada.nextInt();
		System.out.println("Qual o Minimo do estoque ?");

		
		int total = (maximoEs + minimoEs)/2;
		System.out.println("A Média de produtos do estoque é: " + total);
		
		
		double maX = 155.5;
		double miM = 15.5;
		double totalD = (maX+miM)/2;
		System.out.println("A Média de produtos do estoque é: " + totalD);
		
		
		
		

		
		
		
		

	}

}
