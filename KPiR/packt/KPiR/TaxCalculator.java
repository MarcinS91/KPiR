package packt.KPiR;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaxCalculator extends Database {

	final static double tax = 288.95;
	Scanner sc = new Scanner(System.in);

	public static double totalCost() {

		double totalCost = 0;
		for (Cost cost : costs) {
			totalCost += cost.getValue();
		}
		return totalCost;
	}

	public static double totalProfit() {
		double totalProfit = 0;
		for (Profit profit : profits) {
			totalProfit += profit.getValue();
		}
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

		}

		double final_Tax = (totalProfit() - totalCost() + profi.getBenefice() - profi.getDeposit()) * 0.18 - 586.85
				- profi.getMonth() * tax;

		System.out.println("Podatek za biezacy miesiac wynosi: " + final_Tax);

	}

}
