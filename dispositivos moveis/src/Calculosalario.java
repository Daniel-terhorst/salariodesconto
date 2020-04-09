import java.util.Scanner;
public class Calculosalario {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double valor1, valorfinal, desconto1, desconto2, desconto3, desconto4;
		System.out.println("informe o valor do salário:"); 	
		valor1 = entrada.nextDouble();
		
       if (valor1 < 1800.00) {
		desconto1 = valor1 * 0.9;
		valorfinal = valor1 - desconto1;
	   if (valor1 > 1800.01 && valor1 <= 2750.00);
		desconto2 = valor1*  0.10;
	  valorfinal = valor1 - desconto2;
	   if (valor1 > 2750.01 && valor1 <= 4780.00);
		desconto3 = valor1 * 10.5/100;
		  valorfinal = valor1 - desconto3;
	   if(valor1 > 4780.01);
		  desconto4 = valor1 * 0.12;
		  System.out.println("O seu salário é de;" + valorfinal);
		  
		}

	}
}
