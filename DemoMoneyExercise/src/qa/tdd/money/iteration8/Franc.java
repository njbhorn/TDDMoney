package qa.tdd.money.iteration8;

public class Franc extends Money {
	
	public Franc(int amt) {
		super(amt) ;
		this.currency = "CHF" ;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( obj instanceof Franc ) {
			if ( this.getAmount() == ((Franc) obj).getAmount() ) {
				return true ;
			} else { 
				return false ;
			}
		} else {
			return false ;
		}
	
	}

	
}
