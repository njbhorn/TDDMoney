package qa.tdd.money.iteration8;

public class Dollar extends Money {

	public Dollar(int amt) {
		super(amt);
		this.currency = "USD" ;
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
