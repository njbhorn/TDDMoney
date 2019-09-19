package qa.tdd.money.iterationA;

import org.junit.jupiter.api.function.Executable;

public class Money {
	private int amount ;
	protected String currency ;

	public Money(int amt, String currency ) {
		this.amount = amt ;
		this.currency = currency ;
	}

	public Money timesBy(int i) {
		return new Money ( this.amount * i, this.getCurrency()) ;
	}
	
	public int getAmount() {
		return amount;
	}

	public static Money dollar(int i) {
		return new Money ( i, "USD" ) ;
	}

	public static Money franc(int i) {
			return new Money ( i, "CHF" ) ;
	}

	public String getCurrency() {
		return this.currency;
	}
	
	@Override
	public boolean equals(Object obj) {
		Money other = (Money) obj ;
		if ( this.getCurrency().equals(other.getCurrency())) {
			if ( this.getAmount() == other.getAmount() ) {
				return true ;
			} else { 
				return false ;
			}
		} else {
			return false ;
		}
	
	}

	public static Money add(Money m1, Money m2) {
		if ( m1.getCurrency().equals(m2.getCurrency())) {
			return new Money ( m1.getAmount() + m2.getAmount(), m1.getCurrency()) ;
		} else {
			throw new IllegalArgumentException(String.format( "Currency %s and %s are not the same!",  m1.getCurrency(), m2.getCurrency())) ;
		}
		
	}
}
