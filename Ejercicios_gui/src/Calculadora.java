import java.util.Scanner;


public class Calculadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		int num2;
		
		Scanner lector = new Scanner (System.in);
		Pantalla calculadora = new Pantalla(300,500,"Calculadora");
		calculadora.mostrar();
		
		System.out.println("num 1");
		num1=lector.nextInt();
		System.out.println("num 2");
		num2=lector.nextInt();
		
		Operaciones calculadoraC = new Operaciones(num1,num2);
		System.out.println(calculadoraC.resta());
		
		
	}

}
