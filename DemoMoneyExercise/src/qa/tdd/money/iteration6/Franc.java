package qa.tdd.money.iteration6;

public class Franc extends Money {
	
	public Franc(int amt) {
		super(amt) ;
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
