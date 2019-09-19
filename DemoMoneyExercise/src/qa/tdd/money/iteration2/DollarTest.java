package qa.tdd.money.iteration2;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DollarTest {

	@BeforeEach
	void setUp() throws Exception {
	}
	
	@Test
	void constructorWithFive() {
		Dollar dollar = new Dollar ( 5 ) ;
		int expected = 5 ;
		int actual = dollar.getAmount() ;
		assertThat ( actual , is ( equalTo ( expected))) ;
	}

	@Test
	void fiveTimesTwoIsTen() {
//		Assign
		Dollar dollar = new Dollar ( 5 ) ;
		int expected = 10 ;
//		Act
		Dollar dollar2  = dollar.timesBy ( 2 ) ;
		int actual = dollar2.getAmount() ;
		
//		Assert
		assertThat ( "$5 * 2 Failed", actual , is ( equalTo ( expected ))) ;
	}

}
