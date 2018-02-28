package quiz2;

import quiz2.Q1;
import static org.junit.Assert.*;
import org.junit.Test;

public class q1test { {
	
	Q1 q=new Q1(35000,0,60,0.1/12);
	assertEquals(743.65,q.monthpay());
	assertEquals(9618.79,q.totalinterest());		
	

}
}