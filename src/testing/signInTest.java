package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import try1.login;
import try1.new_sign_in;

class signInTest {
	new_sign_in obj=new new_sign_in();
	@Test
	public void logintest() {			
		int test = obj.register("atharv","HOD","atharv123","712345689","atharv@gmail.com");
		assertEquals(test,1);
	} 
	@Test
	public void logintest2() {			
		int test = obj.register("","HOD","atharv123","712345689","atharv@gmail.com");
		assertEquals(test,1);
	}
	@Test
	public void logintest3() {			
		int test = obj.register("atharv","","atharv123","712345689","atharv@gmail.com");
		assertEquals(test,1);
	}
	@Test
	public void logintest4() {			
		int test = obj.register("atharv","HOD","atharv123","712345689","atharv");
		assertEquals(test,1);
	}
}
