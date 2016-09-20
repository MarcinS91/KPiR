package packt.KPiR;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Database implements IDatabase {

	static List<Cost> costs = new ArrayList();
	static List<Profit> profits = new ArrayList();
	Scanner sc = new Scanner(System.in);

	public void ADD_COST(Scanner sc) {

		System.out.println("Podaj numer porzadkowy, zdarzenie, date i wartosc ");
		try {
			Cost cost = new Cost();
			cost.setID(sc.nextInt());
			sc.nextLine();
			cost.setEvent(sc.next());
			cost.setDate(sc.next());
			cost.setValue(sc.nextDouble());
			sc.nextLine();
			costs.add(cost);

		} catch (InputMismatchException exc) {
			System.out.println("Dane w nieprawidlowym formacie");
		}

	}

	public void ADD_PROFIT(Scanner sc) {

		System.out.println("Podaj numer porzadkowy, numer faktury i wartosc przychodu: ");
		try {
			Profit profit = new Profit();
			profit.setID(sc.nextInt());
			sc.nextLine();
			profit.setFactureNr(sc.next());
			profit.setActualProfit(sc.nextDouble());
			sc.nextLine();
			profits.add(profit);
		} catch (InputMismatchException exc) {
			System.out.println("Dane w nieprawidlowym formacie");
		}
	}

	public void REMOVE_COST(Scanner sc) {

		System.out.println("Podaj numer pozycji ktora chcesz usunac: ");
		int i = sc.nextInt();
		costs.remove(i);
	}

	public void REMOVE_PROFIT(Scanner sc) {

		System.out.println("Podaj numer pozycji ktora chcesz usunac:");
		int i = sc.nextInt();
		profits.remove(i);
	}

	public void PRINT_ALL() {

		System.out.println("--------------------");
		System.out.println("Wprowadzone dane do tabeli kosztow: ");
		costs.stream().forEach(cost -> System.out.println(cost));

		System.out.println("--------------------");
		System.out.println("Wprowadzone dane do tabeli dochodów: ");
		profits.stream().forEach(profit -> System.out.println(profit));
	}

}
