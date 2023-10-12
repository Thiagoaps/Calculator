package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp = 's';
		do {
			System.out.println("Enter the first value:");
			double firstValue = sc.nextDouble();
			System.out.println("Enter the operator (+,-,*,/):");
			char operation = sc.next().charAt(0);
			System.out.println("Enter the second value:");
			double secondValue = sc.nextDouble();

			if (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
				System.out.println("You enter the wrong input!");
			} else {
				Calculator calculator = new Calculator(firstValue, secondValue);

				double result = 0;

				switch (operation) {
				case '+':
					result = calculator.addition();
					break;
				case '-':
					result = calculator.subtraction();
					break;
				case '*':
					result = calculator.multiplication();
					break;
				case '/':
					result = calculator.division();
					break;
				default:
					System.out.println("You enter the wrong input!");
				}

				System.out.println();
				System.out.println("Result:");
				System.out.println(calculator.getFirstValue() + " " + operation + " " + calculator.getSecondValue() + " = " + result);
				System.out.println();
				System.out.print("Would you like to repeat? (s/n): ");
				resp = sc.next().charAt(0);
				System.out.println();
			}
		} while (resp == 's');

		sc.close();
	}

}
