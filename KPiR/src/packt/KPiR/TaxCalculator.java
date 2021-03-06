package packt.KPiR;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaxCalculator extends Database {

	final static double tax = 288.95;
	Scanner sc = new Scanner(System.in);

	public static double totalCost() {

		double totalCost = 0;
		totalCost = costs.stream().mapToDouble(cost -> cost.getValue()).sum();

		return totalCost;
	}

	public static double totalProfit() {
		double totalProfit = 0;
		totalProfit = profits.stream().mapToDouble(profit -> profit.getValue()).sum();

		return totalProfit;
	}

	void CALCULATE(Scanner sc) {
		Profit profi = new Profit();
		try {
			System.out.println("Podaj laczne przychody z poprzednich miesiecy rozliczeniowych: ");
			profi.setBenefice(sc.nextDouble());
			sc.nextLine();
			System.out.println("Podaj zaliczki zaplacone na poczet podatku");
			profi.setDeposit(sc.nextDouble());
			sc.nextLine();
			System.out.println("Podaj numer biezacego miesiaca: ");
			profi.setMonth(sc.nextInt());
			sc.nextLine();
		} catch (InputMismatchException ex) {
			System.out.println("Dane w nieprawidlowym formacie");
		}

		double final_Tax = (totalProfit() - totalCost() + profi.getBenefice() - profi.getDeposit()) * 0.18 - 586.85
				- profi.getMonth() * tax;

		System.out.println("Podatek za biezacy miesiac wynosi: " + final_Tax);

	}

}
