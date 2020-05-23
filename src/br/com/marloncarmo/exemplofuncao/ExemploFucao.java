package br.com.marloncarmo.exemplofuncao;

import java.util.Scanner;

public class ExemploFucao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite três números inteiros: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a, b, c);
		
		apresentaResultado(maior);
		sc.close();
	}
	
	public static int max (int x, int y, int z) {
		int aux;
		if(x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	public static void apresentaResultado(int valor) {
		System.out.println("Maior = "+valor);
	}
}
