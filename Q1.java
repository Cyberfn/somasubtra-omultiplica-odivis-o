package Questoes;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número:");
		 double n1 = entrada.nextDouble();
		 
		 System.out.println("Digite o segundo número:");
		 double n2 = entrada.nextDouble();
		 
		 double soma = n1 + n2 ;
		 double sub = n1 - n2 ;
		 double mult = n1 * n2 ;
		 double div = n1 / n2 ;
		 
		 System.out.println("soma: " + soma);
		 System.out.println("subtração: " + sub);
		 System.out.println("multiplicação: " + mult);
		 System.out.println("divisão: " + div);
		
	}

}
