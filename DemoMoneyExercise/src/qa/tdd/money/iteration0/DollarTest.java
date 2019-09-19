package qa.tdd.money.iteration0;

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
	void test() {
//		Assign
		Dollar dollar = new Dollar ( 5 ) ;
		int expected = 10 ;
//		Act
		int actual  = dollar.timesBy ( 2 ) ;
		
//		Assert
		assertThat ( "$5 * 2 Failed", actual , is ( equalTo ( expected ))) ;
	}

}
