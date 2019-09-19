package qa.tdd.money.iteration4;

public class Franc {
	private int amount ;

	public Franc(int amt) {
		this.amount = amt ;
	}

	public Franc timesBy(int i) {
		return new Franc ( this.amount * i) ;
	}
	
	public int getAmount() {
		return amount;
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
