package at.fhj.swd;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void testSingleInstance() {
		Singleton mySingleton = Singleton.requestInstance();
		Singleton mySecondSingleton = Singleton.requestInstance();
		
		assertEquals(mySingleton, mySecondSingleton);
	}
	
	@Test
	public void testRequestInstance() {
		Singleton mySingleton = Singleton.requestInstance();
		
		assertNotNull(mySingleton);
	}

}
