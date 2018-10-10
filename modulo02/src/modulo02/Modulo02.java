package modulo02;

import java.util.Scanner;

public class Modulo02 {

	public static void main (String args[]) {
		questao01();
		questao02();
		questao03();
	}
	
	public static void questao01 () {
		Scanner input = new Scanner(System.in);
		int numero, i, j;
		
		do{
			System.out.println("Informe um número:");
			numero = input.nextInt();
			if (numero % 2 == 0) {
				System.out.println("O número é par");
			}
			if (numero%3 == 0) {
				System.out.println("O número é múltiplo de 3");
			}
			System.out.println("OS primeiros 10 múltiplos do número:");
			j=1;
			for (i=1; i<=10 && j<=numero; j++) {
				if (numero % j == 0) {
					System.out.println(j);
					i++;
				}
			}
			
		}while (numero>0);
		input.close();
	}
	
	public static void questao02() {
		Scanner input = new Scanner (System.in);
		int num1, num2, num3;
		
		System.out.println("Informe o primeiro número:");
		num1 = input.nextInt();
		
		System.out.println("Informe o segundo número:");
		num2 = input.nextInt();
		
		System.out.println("Informe o terceiro número:");
		num3 = input.nextInt();
		
		System.out.println("O produto dos números é: " + num1*num2*num3);
		
		input.close();
	}
	
	public static void questao03() {
		Scanner input = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Informe o primeiro número:");
		num1 = input.nextInt();
		
		System.out.println("Informe o segundo número:");
		num2 = input.nextInt();
		
		System.out.println("Informe o terceiro número:");
		num3 = input.nextInt();
		
		if (num1 > num2 && num1>num3) {
			System.out.println("O maior número é: " + num1);
		}
		else if (num2 > num3) {
			System.out.println("O maior número é: " + num2);
		}
		else {
			System.out.println("O maior número é: " + num3);
		}
		
		input.close();
	}
	
}
