package qa.tdd.money.iteration6;

public class Dollar extends Money {

	public Dollar(int amt) {
		super(amt);
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
