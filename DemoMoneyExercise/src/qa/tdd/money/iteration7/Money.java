package qa.tdd.money.iteration7;

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

	public static Money dollar(int i) {
		return new Dollar ( i ) ;
	}

	public static Money franc(int i) {
		return new Franc ( i ) ;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if ( obj instanceof Money ) {
//			if ( this.getAmount() == ((Money) obj).getAmount() ) {
//				return true ;
//			} else { 
//				return false ;
//			}
//		} else {
//			return false ;
//		}
//	
//	}
}
