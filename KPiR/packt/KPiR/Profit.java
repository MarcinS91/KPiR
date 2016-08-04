package packt.KPiR;

public class Profit {

	private double benefice;
	private int ID;
	private String factureNr;
	private double actualProfit;
	private int month;
	private double deposit;
	private double value;

	public Profit() {
		this.benefice = 0;
		this.month = 0;
		this.deposit = 0;
		this.actualProfit = 0;
		this.ID = 0;
		this.factureNr = "";
		this.value = 0;
	}

	public Profit(double benefice, int month, double deposit, double actualProfit, int ID, String factureNr,
			double value) {
		this.benefice = benefice;
		this.month = month;
		this.deposit = deposit;
		this.actualProfit = actualProfit;
		this.ID = ID;
		this.factureNr = factureNr;
		this.value = value;
	}

	@Override
	public String toString() {
		return this.ID + " " + this.factureNr + " " + this.actualProfit;
	}

	public double getBenefice() {
		return benefice;
	}

	public void setBenefice(double benefice) {
		this.benefice = benefice;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFactureNr() {
		return factureNr;
	}

	public void setFactureNr(String factureNr) {
		this.factureNr = factureNr;
	}

	public double getActualProfit() {
		return actualProfit;
	}

	public void setActualProfit(double actualProfit) {
		this.actualProfit = actualProfit;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

}
