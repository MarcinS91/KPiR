package packt.KPiR;

import java.util.Scanner;

public interface IDatabase {

	public void ADD_COST(Scanner sc);

	public void ADD_PROFIT(Scanner sc);

	public void REMOVE_COST(Scanner sc);

	public void REMOVE_PROFIT(Scanner sc);

	public void PRINT_ALL();
}
