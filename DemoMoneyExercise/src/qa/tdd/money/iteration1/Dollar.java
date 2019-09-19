package qa.tdd.money.iteration1;

public class Dollar {
	private int amount ;

	public Dollar(int amt) {
		this.amount = amt ;
	}

	public int timesBy(int i) {
		return this.amount * i;
	}
	
	public int getAmount() {
		return amount;
	}
}
