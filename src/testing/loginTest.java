package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import try1.login;

public class loginTest {
	login obj=new login();
	@Test
	public void logintest() {		
		int i=obj.loginTask("atharv","123","Teacher");
		assertEquals(1,i);
	}
	@Test
	public void logintest2(){		
		int i=obj.loginTask("chirag","123","Teacher"); 
		assertEquals(1,i);
	}
	@Test
	public void logintest3(){		
		int i=obj.loginTask("aditi","123","HOD");
		assertEquals(1,i);
	}
	@Test
	public void logintest4(){		 
		int i=obj.loginTask("shubham","shubham@123","Student");
		assertEquals(1,i);
	}
	@Test
	public void logintest5(){		
		int i=obj.loginTask("atharv","123","Principal");
		assertEquals(1,i);
	}
}
