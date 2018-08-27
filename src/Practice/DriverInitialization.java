package Practice;

public class DriverInitialization {

	private static DriverInitialization driver = null;

	private DriverInitialization() {
		System.out.println("private constructor");
	}

	public static DriverInitialization initializeDriver() {
		if (driver == null) {
			driver = new DriverInitialization();
			// driver = new ChromeDriver();
		}
		
		return driver;
	}

	/*
	 * DriverInitialization dr = null; private webDriver driver;
	 * 
	 * private DriverInitialization() {
	 * 
	 * } public static webDriver openBrowser() { driver = new ChromeDriver(); }
	 */
	public static void main(String... args) 
	{
		DriverInitialization driver1 = DriverInitialization.initializeDriver();
		DriverInitialization driver2 = DriverInitialization.initializeDriver();
		DriverInitialization driver3 = DriverInitialization.initializeDriver();
	}
}