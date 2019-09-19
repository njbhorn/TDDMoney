package qa.tdd.money.iteration3;

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
	
	@Override
	public boolean equals(Object obj) {
		if ( obj instanceof Dollar ) {
			if ( this.getAmount() == ((Dollar) obj).getAmount() ) {
				return true ;
			} else { 
				return false ;
			}
		} else {
			return false ;
		}
	
	}

}
