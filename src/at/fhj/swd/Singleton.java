package at.fhj.swd;

public class Singleton {
	private static Singleton uniqueInstance;

	private Singleton() {
		System.out.println("Singleton constructor called");
	}

	public static Singleton requestInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new Singleton();

		return uniqueInstance;
	}
}