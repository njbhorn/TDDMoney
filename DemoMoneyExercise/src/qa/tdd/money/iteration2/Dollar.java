package qa.tdd.money.iteration2;

public class Dollar {
	private int amount ;

	public Dollar(int amt) {
		this.amount = amt ;
	}

	public Dollar timesBy(int i) {
		return new Dollar ( this.amount * i) ;
	}
	
	public int getAmount() {
		return amount;
	}

}
