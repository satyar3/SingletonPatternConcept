package Practice;

public class SingletonConcept {
	
	//In OOPS, Singleton class is a class that can have only one object or instance of the class
	//in case new object or instance created, it'll point to the same object
	
	//How to design ?
	//1.Constructor of that class as Private
	//2.Write a public static method that has return type object of this singleton class (Lazy Initialization)
	
	private static SingletonConcept SingletonConcept_instance = null;
	
	public String str;
	
	private SingletonConcept()
	{
		str = "Test";
		//System.out.println("Done");
	}
	
	public static SingletonConcept getInstance()
	{
		if(SingletonConcept_instance == null)//Lazy Initialization
		{
			SingletonConcept_instance = new SingletonConcept();
			System.out.println();
		}
		
		return SingletonConcept_instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SingletonConcept st = new SingletonConcept();
		SingletonConcept st1 = SingletonConcept.getInstance();
		SingletonConcept st2 = SingletonConcept.getInstance();
		SingletonConcept st3 = SingletonConcept.getInstance();
		
		st1.str = (st1.str).toUpperCase();
		System.out.println(st1.str);
		System.out.println(st2.str);
		
		st2.str = (st2.str).toLowerCase();
		System.out.println(st1.str);
		System.out.println(st2.str);

	}

}
