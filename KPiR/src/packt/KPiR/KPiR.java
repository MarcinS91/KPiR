package packt.KPiR;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KPiR {

	private static final int CALCULATE = 1;
	private static final int ADD_COST = 2;
	private static final int ADD_PROFIT = 3;
	private static final int REMOVE_COST = 4;
	private static final int REMOVE_PROFIT = 5;
	private static final int PRINT_ALL = 6;
	private static final int EXIT = 7;
	private static final int HELP = 8;

	public static void main(String[] args) {

		int option = 0;
		Scanner sc = new Scanner(System.in);
		TaxCalculator taxCalc = new TaxCalculator();
		Database solve = new Database();

		System.out.println("Witaj w programie KPiR, wybierz jedna z ponizszych opcji: ");
		do {
			printOptions();
			try {
				option = sc.nextInt();
				sc.nextLine();
			} catch (InputMismatchException exc) {
				sc.nextLine();
				System.out.println("---------------------");
				System.out.println("Dane w nieprawidlowym formacie");
				continue;
			}

			switch (option) {

			case CALCULATE:
				taxCalc.CALCULATE(sc);
				break;

			case ADD_COST:
				solve.ADD_COST(sc);
				break;

			case ADD_PROFIT:
				solve.ADD_PROFIT(sc);
				break;

			case REMOVE_PROFIT:
				solve.REMOVE_PROFIT(sc);
				break;

			case REMOVE_COST:
				solve.REMOVE_COST(sc);
				break;

			case PRINT_ALL:
				solve.PRINT_ALL();
				break;

			case HELP:
				solve.HELP();
			case EXIT:

				break;
			}

		} while (option != EXIT);

		sc.close();
	}

	private static void printOptions() {

		System.out.println("---------------------");
		System.out.println("Dostepne opcje: ");
		System.out.println(CALCULATE + "- obliczenie podatku");
		System.out.println(ADD_COST + "- dodanie pozycji do tabeli kosztow");
		System.out.println(ADD_PROFIT + "- dodanie pozycji do tabeli przychodow ");
		System.out.println(REMOVE_COST + "- usun pozycje z tabeli kosztow");
		System.out.println(REMOVE_PROFIT + "- usun pozycje z tabeli przychodow");
		System.out.println(PRINT_ALL + "- pokaz wprowadzone dane");
		System.out.println(EXIT + "- wyjscie z programu");
		System.out.println(HELP + "- pomoc");
		System.out.print("Wybierz opcje: ");

	}


}
