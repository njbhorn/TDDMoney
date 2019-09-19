package qa.tdd.money.iteration5;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoneyTest {

	@BeforeEach
	void setUp() throws Exception {
	}
	
	@Test
	void constructorWithFive() {
		Money dollar = new Dollar ( 5 ) ;
		int expected = 5 ;
		int actual = dollar.getAmount() ;
		assertThat ( actual , is ( equalTo ( expected))) ;
	}

	@Test
	void fiveTimesTwoIsTen() {
//		Assign
		Money dollar = new Dollar ( 5 ) ;
//		Act
		Money dollar2  = dollar.timesBy ( 2 ) ;
		int actual = dollar2.getAmount() ;
		int expected = 10 ;
		
//		Assert
		assertThat ( "$5 * 2 Failed", actual , is ( equalTo ( expected ))) ;
	}
	
	@Test
	void dollarFiveEqualsDollarFive() {
//		Assign
		Money d1 = new Dollar ( 5 ) ;
		Money d2 = new Dollar ( 5 ) ;
		boolean expected = true ;
//		Act
		boolean actual = d1.equals(d2) ;
//		Assert
		assertThat ( actual, is ( expected )) ;
		
	}
	
	@Test
	void dollarFiveDoesNotEqualDollarSix() {
//		Assign
		Money d1 = new Dollar ( 5 ) ;
		Money d2 = new Dollar ( 6 ) ;
		boolean expected = false ;
//		Act
		boolean actual = d1.equals(d2) ;
//		Assert
		assertThat ( actual, is ( expected )) ;
	}
	
	@Test
	void fiveTimesTwoIsTenFranc() {
//		Assign
		Money franc = new Franc ( 5 ) ;
//		Act
		Money franc2  = franc.timesBy ( 2 ) ;
		int actual = franc2.getAmount() ;
		int expected = 10 ;
		
//		Assert
		assertThat ( "$5 * 2 Failed", actual , is ( equalTo ( expected ))) ;
	}
	
	@Test
	void francFiveEqualsFrancFive() {
//		Assign
		Money f1 = new Franc ( 5 ) ;
		Money f2 = new Franc ( 5 ) ;
		boolean expected = true ;
//		Act
		boolean actual = f1.equals(f2) ;
//		Assert
		assertThat ( actual, is ( expected )) ;
		
	}
	
	@Test
	void francFiveDoesNotEqualFrancSix() {
//		Assign
		Money f1 = new Franc ( 5 ) ;
		Money f2 = new Franc ( 6 ) ;
		boolean expected = false ;
//		Act
		boolean actual = f1.equals(f2) ;
//		Assert
		assertThat ( actual, is ( expected )) ;
	}
	
	

}
