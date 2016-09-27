package at.fhj.swd;

// Thread-safe Singleton implementation
public class Singleton {
	
	/* 
	 * volatile is used to indicate that a variable's value will be modified by different threads.
	 * 
	 * Declaring a volatile Java variable means:
	 * 
	 * The value of this variable will never be cached thread-locally:
	 * all reads and writes will go straight to main memory.
	 * 
	 * Access to the variable acts as though it is enclosed in a synchronized block,
	 * synchronized on itself. 
	 * 
	*/
	private volatile static Singleton uniqueInstance;

	private Singleton() {
		System.out.println("Singleton constructor called");
	}

	public static Singleton requestInstance() {
		
		if (uniqueInstance == null) {
			// only synchronize the first time, since its very costly
			synchronized (Singleton.class) {
				if (uniqueInstance == null)
					uniqueInstance = new Singleton();
			}
		}
		return uniqueInstance;
	}
}