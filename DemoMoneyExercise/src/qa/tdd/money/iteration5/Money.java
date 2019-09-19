package qa.tdd.money.iteration5;

public class Money {
	private int amount ;

	public Money(int amt) {
		this.amount = amt ;
	}

	public Money timesBy(int i) {
		return new Money ( this.amount * i) ;
	}
	
	public int getAmount() {
		return amount;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( obj instanceof Money ) {
			if ( this.getAmount() == ((Money) obj).getAmount() ) {
				return true ;
			} else { 
				return false ;
			}
		} else {
			return false ;
		}
	
	}
}
