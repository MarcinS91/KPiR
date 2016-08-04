package packt.KPiR;

public class Cost {

	private int ID;
	private String event;
	private String number;
	private String date;
	private double value;

	public Cost() {
		this.ID = 0;
		this.event = "";
		this.number = "";
		this.date = "";
		this.value = 0;

	}

	public Cost(int ID, String event, String number, String date, double value) {
		this.ID = ID;
		this.event = event;
		this.number = number;
		this.date = date;
		this.value = value;

	}

	@Override
	public String toString() {
		return this.ID + " " + this.event + " " + this.number + " " + this.date + " " + this.value;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

}
